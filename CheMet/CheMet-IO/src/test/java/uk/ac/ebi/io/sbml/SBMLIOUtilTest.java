/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.io.sbml;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sbml.jsbml.SBMLDocument;
import org.sbml.jsbml.SBMLException;
import org.sbml.jsbml.SBMLWriter;
import uk.ac.ebi.annotation.crossreference.ChEBICrossReference;
import uk.ac.ebi.chemet.resource.basic.BasicChemicalIdentifier;
import uk.ac.ebi.chemet.resource.classification.ECNumber;
import uk.ac.ebi.core.CompartmentImplementation;
import uk.ac.ebi.core.DefaultEntityFactory;
import uk.ac.ebi.core.MetabolicReactionImplementation;
import uk.ac.ebi.core.Reconstruction;
import uk.ac.ebi.core.reaction.MetabolicParticipantImplementation;
import uk.ac.ebi.interfaces.entities.Metabolite;
import uk.ac.ebi.io.xml.SBMLIOUtil;
import uk.ac.ebi.resource.ReconstructionIdentifier;
import uk.ac.ebi.resource.chemical.ChEBIIdentifier;
import uk.ac.ebi.resource.organism.Taxonomy;

import javax.xml.stream.XMLStreamException;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;


/**
 *
 * @author johnmay
 */
public class SBMLIOUtilTest {

    public SBMLIOUtilTest() {
    }


    @BeforeClass
    public static void setUpClass() throws Exception {
    }


    @AfterClass
    public static void tearDownClass() throws Exception {
    }


    @Test
    public void testGetDocument() throws SBMLException, XMLStreamException,
                                         UnsupportedEncodingException {
        Reconstruction recon = new Reconstruction(new ReconstructionIdentifier("mnb-project"),
                                                  new Taxonomy());
        Metabolite m = DefaultEntityFactory.getInstance().newInstance(Metabolite.class);
        m.setName("molecule name");
        m.addAnnotation(new ChEBICrossReference(new ChEBIIdentifier("CHEBI:12435")));
        recon.addMetabolite(m);

        Metabolite m2 = DefaultEntityFactory.getInstance().newInstance(Metabolite.class, new BasicChemicalIdentifier("m2"), null, null);
        m2.setName("different molecule");
        m.addAnnotation(new ChEBICrossReference(new ChEBIIdentifier("CHEBI:12436")));
        recon.addMetabolite(m2);

        MetabolicReactionImplementation rxn = new MetabolicReactionImplementation();
        rxn.addReactant(new MetabolicParticipantImplementation(m, 1.0, CompartmentImplementation.CYTOPLASM));
        rxn.addProduct(new MetabolicParticipantImplementation(m2, 2.0, CompartmentImplementation.EXTRACELLULA));
        rxn.addCrossReference(new ECNumber("1.1.1.1"));
        recon.addReaction(rxn);

        SBMLDocument doc = new SBMLIOUtil().getDocument(recon);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        SBMLWriter.write(doc, stream, "MNB", "1.0");
        String result = stream.toString("UTF-8");
        System.out.println("SBML:" + result);
        // todo assertEquals

    }
}
