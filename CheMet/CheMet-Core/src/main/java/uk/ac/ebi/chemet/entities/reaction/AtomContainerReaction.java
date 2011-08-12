/**
 * AtomContainerReaction.java
 *
 * 2011.08.08
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
package uk.ac.ebi.chemet.entities.reaction;

import java.io.Serializable;
import java.util.*;
import org.apache.log4j.Logger;
import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.Molecule;
import org.openscience.cdk.interfaces.*;
import org.openscience.cdk.smsd.Isomorphism;
import org.openscience.cdk.smsd.interfaces.Algorithm;
import org.openscience.cdk.tools.manipulator.AtomContainerComparator;
import uk.ac.ebi.chemet.entities.Compartment;
import uk.ac.ebi.chemet.entities.reaction.participant.AtomContainerParticipant;
import uk.ac.ebi.chemet.entities.reaction.participant.GenericParticipant;
import uk.ac.ebi.chemet.entities.reaction.participant.Participant;
import uk.ac.ebi.metabolomes.util.CDKUtils;

/**
 * @name    AtomContainerReaction
 * @date    2011.08.08
 * @version $Rev$ : Last Changed $Date$
 * @author  johnmay
 * @author  $Author$ (this version)
 * @brief   Reaction using AtomContainers from CDK. The class provides basic implementation of getting/setting
 *          reactants, products and their coefficients of the IReaction class.
 *
 */
public class AtomContainerReaction
        extends Reaction<IAtomContainer , Double , Compartment> {

    private static final Logger LOGGER = Logger.getLogger( AtomContainerReaction.class );

    public void addReactant( IAtomContainer molecule , Double coef , Compartment compartment ) {
        super.addReactant( new AtomContainerParticipant( molecule , coef ,
                                                         compartment ) );
    }

    public void addProduct( IAtomContainer molecule , Double coef , Compartment compartment ) {
        super.addProduct( new AtomContainerParticipant( molecule , coef ,
                                                        compartment ) );
    }

    public void addReactant( AtomContainerParticipant p ) {
        if ( p instanceof GenericParticipant ) {
            this.generic = true;
        }
        super.addReactant( p );
    }

    public void addProduct( AtomContainerParticipant p ) {
        if ( p instanceof GenericParticipant ) {
            this.generic = true;
        }
        super.addProduct( p );
    }

    
//    /**
//     * Create an instance IReaction object for use with CDK
//     * TODO: Write unit test...
//     * @return IReaction
//     */
//    public IReaction getCDKReaction() {
//
//        IReaction reaction = DefaultChemObjectBuilder.getInstance().newInstance( IReaction.class );
//
//        // add the reactants
//        Iterator<IMolecule> reIt = reactants.iterator();
//        Iterator<Double> rsIt = reactantStoichiometries.iterator();
//        while ( reIt.hasNext() ) {
//            if ( rsIt.hasNext() ) {
//                reaction.addReactant( new Molecule( reIt.next() ) , rsIt.next() );
//            } else {
//                reaction.addReactant( new Molecule( reIt.next() ) );
//            }
//        }
//        // add the product
//        Iterator<IMolecule> prIt = products.iterator();
//        Iterator<Double> psIt = productStoichiometries.iterator();
//        while ( reIt.hasNext() ) {
//            if ( rsIt.hasNext() ) {
//                reaction.addProduct( new Molecule( reIt.next() ) , rsIt.next() );
//            } else {
//                reaction.addProduct( new Molecule( reIt.next() ) );
//            }
//        }
//        return reaction;
//    }

    /* IMPLEMENTATION OF IREACTION INTERFACE */
//    public IMoleculeSet getReactants() {
//        IMoleculeSet molSet = DefaultChemObjectBuilder.getInstance().newInstance( IMoleculeSet.class );
//        Iterator<IMolecule> reIt = super.reactants.iterator();
//        while ( reIt.hasNext() ) {
//            molSet.addAtomContainer( new Molecule( reIt.next() ) );
//        }
//        return molSet;
//    }
//
//    public void setReactants( IMoleculeSet ims ) {
//        for ( int i = 0; i < ims.getAtomContainerCount(); i++ ) {
    //  super.addReactant( ims.getMolecule
//( i ) );
//        }
//    }
//
//    public IMoleculeSet getProducts() {
//        IMoleculeSet molSet = DefaultChemObjectBuilder.getInstance().newInstance( IMoleculeSet.class );
//        Iterator<IMolecule> reIt = super.products.iterator();
//        while ( reIt.hasNext() ) {
//            molSet.addAtomContainer( new Molecule( reIt.next() ) );
//        }
//        return molSet;
//    }
//
//    public void setProducts( IMoleculeSet ims ) {
//        for ( int i = 0; i < ims.getAtomContainerCount(); i++ ) {
//            super.addProduct( ims.getMolecule( i ) );
//        }
//    }
    @Override
    public void addReactant( Participant<IAtomContainer , Double , Compartment> participant ) {
        super.addReactant( participant );
    }
}
