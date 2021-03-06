/**
 * BacterialCompartment.java
 *
 * 2012.02.06
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
package uk.ac.ebi.mdk.domain.entity.reaction.compartment;

import uk.ac.ebi.mdk.domain.entity.reaction.Compartment;

import java.util.Set;


/**
 *
 *          BacterialCompartment 2012.02.06
 * @version $Rev$ : Last Changed $Date$
 * @author  johnmay
 * @author  $Author$ (this version)
 *
 *          Tissue and Cell Types
 *
 */
public enum Membrane implements Compartment {

    // Membranes
    GOLGI_MEMBRANE(
    "gm", "Golgi Membrane", (byte) 40),
    MITOCHONDRIAL_MEMBRANE("mm", "Mitochondrial Membrane", (byte) 41),
    NUCLEAR_MEMBRANE("nm", "Nuclear Membrane", (byte) 42),
    PLASMA_MEMBRANE("pm", "Plasma Membrane", (byte) 43),
    ENDOPLASMIC_RETICULUM_MEMBRANE("rm", "Endoplasmic Reticulum Membrane", (byte) 44),
    VACUOLAR_MEMBRANE("vm", "Vacuolar Membrane", (byte) 45),
    PEROXISOMAL_MEMBRANE("xm", "Peroxisomal Membrane", (byte) 46);

    private final String abbreviation;

    private final String description;

    private byte index;


    private Membrane(String abbreviation,
                     String description,
                     byte index) {
        this.abbreviation = abbreviation;
        this.description = description;
        this.index = index;
    }


    public String getAbbreviation() {
        return abbreviation;
    }


    public String getDescription() {
        return description;
    }


    public Set<String> getSynonyms() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public byte getRanking() {
        return index;
    }


    @Override
    public String toString() {
        return getAbbreviation();
    }
}
