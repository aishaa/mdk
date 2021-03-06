/**
 * BasicGeneIdentifier.java
 *
 * 2011.10.17
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
package uk.ac.ebi.mdk.domain.identifier.basic;

import org.apache.log4j.Logger;
import uk.ac.ebi.caf.utility.preference.type.IncrementalPreference;
import uk.ac.ebi.caf.utility.preference.type.StringPreference;
import uk.ac.ebi.mdk.lang.annotation.Brief;
import uk.ac.ebi.mdk.lang.annotation.Description;
import uk.ac.ebi.mdk.ResourcePreferences;
import uk.ac.ebi.mdk.domain.identifier.AbstractIdentifier;
import uk.ac.ebi.mdk.domain.identifier.Identifier;


/**
 *          BasicGeneIdentifier - 2011.10.17 <br>
 *          A basic gene identifier
 * @version $Rev$ : Last Changed $Date$
 * @author  johnmay
 * @author  $Author$ (this version)
 */
@Brief("Gene")
@Description("A basic auto-incrementing identifier for genes")
public class BasicGeneIdentifier extends AbstractIdentifier {

    private static final Logger LOGGER = Logger.getLogger(BasicGeneIdentifier.class);

    public BasicGeneIdentifier() {
        super();
    }

    public BasicGeneIdentifier(String accession) {
        super(accession);
    }

    private static String nextAccession(){
        StringPreference format = ResourcePreferences.getInstance().getPreference("BASIC_GENE_ID_FORMAT");
        IncrementalPreference ticker = ResourcePreferences.getInstance().getPreference("BASIC_GENE_ID_TICK");
        return String.format(format.get(), ticker.get());
    }

    public Identifier newInstance() {
        return new BasicGeneIdentifier();
    }

    public static BasicGeneIdentifier nextIdentifier() {
        return new BasicGeneIdentifier(nextAccession());
    }

}
