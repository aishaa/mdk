/**
 * ChEBIIdentifier.java
 *
 * 2011.08.16
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
package uk.ac.ebi.mdk.domain.identifier;

import org.apache.log4j.Logger;
import uk.ac.ebi.mdk.domain.IdentifierMetaInfo;
import uk.ac.ebi.mdk.deprecated.MIR;

/**
 *
 * @name    ChEBIIdentifier – 2011.08.16
 *          Class description
 *
 * @version $Rev$ : Last Changed $Date$
 * @author  johnmay
 * @author  $Author$ (this version)
 */
@MIR(2)
public final class ChEBIIdentifier
        extends ChemicalIdentifier implements Cloneable {

    private static final Logger LOGGER = Logger.getLogger(ChEBIIdentifier.class);

    private static final IdentifierMetaInfo META_DATA = IDENTIFIER_LOADER.getMetaInfo(
            ChEBIIdentifier.class);

    public ChEBIIdentifier() {
    }

    /**
     *
     * Constructor a ChEBI identifier with a given accession. The accession given should begin with 'ChEBI:'.
     *
     * @param accession
     *
     */
    public ChEBIIdentifier(String accession) {
        super(accession);

        // normalise
        if(getAccession().contains("ChEBI")){
            super.setAccession(super.getAccession().replaceFirst("ChEBI", "CHEBI"));
        }

    }


    @Override
    public void setAccession(String accession) {

        if(accession == null) {
            throw new NullPointerException("Provided ChEBI identifier was null");
        }

        if (accession.matches("^\\d+")) {
            accession = "CHEBI:" + accession;
        }
        accession = accession.replaceAll("ChEBI", "CHEBI");
        super.setAccession(accession);
    }


    /**
     * Convenience constructor allows instantiation with only the
     * integer accession of a ChEBI accession
     *
     * @param accession Integer part of a ChEBI accession
     */
    public ChEBIIdentifier(Integer accession) {
        super("CHEBI:" + accession);
    }


    /**
     * @inheritDoc
     */
    @Override
    public ChEBIIdentifier newInstance() {
        return new ChEBIIdentifier();
    }



    /**
     * @inheritDoc
     */
    @Override
    public String getShortDescription() {
        return META_DATA.brief;
    }


    /**
     * @inheritDoc
     */
    @Override
    public String getLongDescription() {
        return META_DATA.description;
    }


    /**
     * @inheritDoc
     */
    @Override
    public Resource getResource() {
        return META_DATA.resource;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    /**
     * Returns the numeric part of the CHEBI accession.
     * @return 
     */
    public String getNumericPartOfAccession() {
        return super.getAccession().replace("ChEBI:", "").replace("CHEBI:", "");
    }


    public Integer getValue() {
        return Integer.parseInt(getAccession().substring(6));
    }
}
