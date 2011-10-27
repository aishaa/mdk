/**
 * ResourcePanel.java
 *
 * 2011.10.27
 *
 * This file is part of the CheMet library
 * 
 * The CheMet library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * CheMet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with CheMet.  If not, see <http://www.gnu.org/licenses/>.
 */
package uk.ac.ebi.resource;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.Sizes;
import java.awt.Desktop.Action;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import org.apache.log4j.Logger;
import uk.ac.ebi.interfaces.services.RemoteResource;
import uk.ac.ebi.io.remote.RemoteResourceManager;

/**
 *          ResourcePanel - 2011.10.27 <br>
 *          Class description
 * @version $Rev$ : Last Changed $Date$
 * @author  johnmay
 * @author  $Author$ (this version)
 */
public class ResourcePanel extends JPanel {

    private static final Logger LOGGER = Logger.getLogger(ResourcePanel.class);
    private RemoteResourceManager manager = RemoteResourceManager.getInstance();
    private CellConstraints cc = new CellConstraints();
    private FormLayout layout = new FormLayout("p, 4dlu, p, 4dlu, p, 4dlu, p, 4dlu, p");

    public ResourcePanel() {

        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh:mm");
        setBorder(Borders.createEmptyBorder("6dlu, 6dlu, 6dlu, 6dlu"));
        setLayout(layout);
        for (RemoteResource resource : manager.getResources()) {
            layout.appendRow(new RowSpec(Sizes.PREFERRED));

            JLabel desc = new JLabel();
            JLabel date = new JLabel();
            JTextField local = new JTextField(20);
            JTextField remote = new JTextField(20);
            JButton update = new JButton(new UpdateResource(resource));

            local.setEditable(false);
            remote.setEditable(false);

            date.setFont(new Font("VERDANA", Font.BOLD, 11));
            date.setFont(new Font("VERDANA", Font.PLAIN, 11));
            local.setFont(new Font("VERDANA", Font.PLAIN, 11));
            remote.setFont(new Font("VERDANA", Font.PLAIN, 11));
            update.setFont(new Font("VERDANA", Font.PLAIN, 11));

            desc.setText(resource.getDescription() + ":");
            desc.setAlignmentY(SwingConstants.RIGHT);
            date.setText(resource.getLastUpdated().getTime() == 0l ? "Not loaded" : dateFormat.format(resource.getLastUpdated()));
            local.setText(resource.getLocal().getPath());
            remote.setText(resource.getRemote().getPath());

            add(desc, cc.xy(1, layout.getRowCount()));
            add(date, cc.xy(3, layout.getRowCount()));
            add(local, cc.xy(5, layout.getRowCount()));
            add(remote, cc.xy(7, layout.getRowCount()));
            add(update, cc.xy(9, layout.getRowCount()));
        }
    }

    private class UpdateResource extends AbstractAction {

        private RemoteResource resource;
        private AbstractAction button;

        public UpdateResource(RemoteResource resource) {
            super("Update");
            this.resource = resource;
        }

        public void actionPerformed(ActionEvent e) {
            this.button = this;

            try {
                this.setEnabled(false);
                SwingWorker worker = new SwingWorker() {

                    @Override
                    protected Object doInBackground() throws Exception {
                        resource.update();
                        SwingUtilities.invokeLater(new Runnable() {

                            public void run() {
                                button.setEnabled(true);
                            }
                        });
                        return null;
                    }
                };
                worker.execute();
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(ResourcePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                JFrame frame = new JFrame();
                frame.setTitle("Resource Manager");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new ResourcePanel());
                frame.pack();
                frame.setVisible(true);
            }
        });

    }
}
