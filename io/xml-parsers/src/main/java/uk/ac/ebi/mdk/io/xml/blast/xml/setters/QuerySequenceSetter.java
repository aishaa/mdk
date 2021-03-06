/**
 * QueryStartSetter.java
 *
 * 2011.10.10
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
package uk.ac.ebi.mdk.io.xml.blast.xml.setters;

import org.codehaus.stax2.XMLStreamReader2;
import uk.ac.ebi.mdk.domain.observation.sequence.LocalAlignment;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

/**
 * @name    QueryStartSetter - 2011.10.10 <br>
 *          Class description
 * @version $Rev$ : Last Changed $Date$
 * @author  johnmay
 * @author  $Author$ (this version)
 */
public class QuerySequenceSetter implements AlignmentSetter {

    public void set(LocalAlignment alignment, XMLStreamReader2 xmlr) throws XMLStreamException {

        StringBuilder sb = new StringBuilder(200);

        // read until the end of the element

        while (xmlr.hasNext()) {
            int eventType = xmlr.next();
            if (eventType == XMLEvent.END_ELEMENT) {
                alignment.setQuerySequence(sb.toString());
                return;
            }
            sb.append(xmlr.getText());

        }
    }
}
