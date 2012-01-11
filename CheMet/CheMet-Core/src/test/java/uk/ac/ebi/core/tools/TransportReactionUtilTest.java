/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.core.tools;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import uk.ac.ebi.chemet.entities.reaction.Reversibility;
import uk.ac.ebi.core.Compartment;
import uk.ac.ebi.core.MetabolicReaction;
import uk.ac.ebi.core.Metabolite;
import uk.ac.ebi.core.reaction.MetaboliteParticipant;
import uk.ac.ebi.resource.chemical.BasicChemicalIdentifier;
import uk.ac.ebi.resource.reaction.BasicReactionIdentifier;
import uk.ac.ebi.resource.reaction.ReactionIdentifier;
import static org.junit.Assert.*;

/**
 *
 * @author johnmay
 */
public class TransportReactionUtilTest {

    public TransportReactionUtilTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testGetClassification_SYMPORT() {

        System.out.print("testGetClassification_SYMPORT ");

        Metabolite atp = new Metabolite(BasicChemicalIdentifier.nextIdentifier(), "atp", "ATP");
        Metabolite alanine = new Metabolite(BasicChemicalIdentifier.nextIdentifier(), "dala", "D-Alanine");

        MetabolicReaction rxn = new MetabolicReaction(BasicReactionIdentifier.nextIdentifier(), "st", "symportTest");

        rxn.addReactant(new MetaboliteParticipant(atp, Compartment.CYTOPLASM));
        rxn.addReactant(new MetaboliteParticipant(alanine, Compartment.CYTOPLASM));

        rxn.addProduct(new MetaboliteParticipant(atp, Compartment.EXTRACELLULA));
        rxn.addProduct(new MetaboliteParticipant(alanine, Compartment.EXTRACELLULA));

        rxn.setReversibility(Reversibility.IRREVERSIBLE_LEFT_TO_RIGHT);

        System.out.println(rxn + " : " + TransportReactionUtil.getClassification(rxn));


        assertEquals(TransportReactionUtil.Classification.SYMPORTER, TransportReactionUtil.getClassification(rxn));

    }

    @Test
    public void testGetClassification_ANTIPORT() {
        System.out.print("testGetClassification_ANTIPORT ");


        Metabolite atp = new Metabolite(BasicChemicalIdentifier.nextIdentifier(), "atp", "ATP");
        Metabolite alanine = new Metabolite(BasicChemicalIdentifier.nextIdentifier(), "dala", "D-Alanine");

        MetabolicReaction rxn = new MetabolicReaction(BasicReactionIdentifier.nextIdentifier(), "st", "symportTest");

        rxn.addReactant(new MetaboliteParticipant(atp, Compartment.CYTOPLASM));
        rxn.addReactant(new MetaboliteParticipant(alanine, Compartment.EXTRACELLULA));

        rxn.addProduct(new MetaboliteParticipant(atp, Compartment.EXTRACELLULA));
        rxn.addProduct(new MetaboliteParticipant(alanine, Compartment.CYTOPLASM));

        rxn.setReversibility(Reversibility.IRREVERSIBLE_LEFT_TO_RIGHT);

        System.out.println(rxn + " : " + TransportReactionUtil.getClassification(rxn));

        assertEquals(TransportReactionUtil.Classification.ANTIPORTER, TransportReactionUtil.getClassification(rxn));

    }
    @Test
    public void testGetClassification_UNIPORT() {
        System.out.print("testGetClassification_UNIPORT ");


        Metabolite atp = new Metabolite(BasicChemicalIdentifier.nextIdentifier(), "atp", "ATP");
        Metabolite alanine = new Metabolite(BasicChemicalIdentifier.nextIdentifier(), "dala", "D-Alanine");

        MetabolicReaction rxn = new MetabolicReaction(BasicReactionIdentifier.nextIdentifier(), "st", "symportTest");

        rxn.addReactant(new MetaboliteParticipant(atp, Compartment.CYTOPLASM));
        rxn.addReactant(new MetaboliteParticipant(alanine, Compartment.EXTRACELLULA));

        rxn.addProduct(new MetaboliteParticipant(atp, Compartment.CYTOPLASM));
        rxn.addProduct(new MetaboliteParticipant(alanine, Compartment.CYTOPLASM));

        rxn.setReversibility(Reversibility.IRREVERSIBLE_LEFT_TO_RIGHT);

        System.out.println(rxn + " : " + TransportReactionUtil.getClassification(rxn));
        assertEquals(TransportReactionUtil.Classification.UNIPORTER, TransportReactionUtil.getClassification(rxn));

    }
}