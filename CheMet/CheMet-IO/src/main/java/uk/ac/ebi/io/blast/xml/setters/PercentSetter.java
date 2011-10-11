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
package uk.ac.ebi.io.blast.xml.setters;

import javax.xml.stream.XMLStreamException;
import org.codehaus.stax2.XMLStreamReader2;
import uk.ac.ebi.observation.sequence.LocalAlignment;

/**
 * @name    QueryStartSetter - 2011.10.10 <br>
 *          Class description
 * @version $Rev$ : Last Changed $Date$
 * @author  johnmay
 * @author  $Author$ (this version)
 */
public class PercentSetter implements AlignmentSetter {

    public void set(LocalAlignment alignment, XMLStreamReader2 xmlr) throws XMLStreamException {
        xmlr.next();
        alignment.setPercentage(Integer.parseInt(xmlr.getText()) / alignment.getLength());
    }
}