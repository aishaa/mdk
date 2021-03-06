/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.mdk.tool;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openscience.cdk.io.MDLV2000Writer;
import uk.ac.ebi.mdk.domain.entity.DefaultEntityFactory;
import uk.ac.ebi.mdk.domain.entity.Metabolite;
import uk.ac.ebi.mdk.tool.domain.PeptideFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author johnmay
 */
public class PeptideFactoryTest {

    public PeptideFactoryTest() {
    }


    @BeforeClass
    public static void setUpClass() throws Exception {
    }


    @AfterClass
    public static void tearDownClass() throws Exception {
    }


    @Test
    public void testBondIndex() throws IOException, Exception {
        PeptideFactory factory = new PeptideFactory(DefaultEntityFactory.getInstance());
        {
            Metabolite m = factory.generateMetabolite(PeptideFactory.AminoAcid.D_ALA, PeptideFactory.AminoAcid.L_ALA, PeptideFactory.AminoAcid.L_ALA, PeptideFactory.AminoAcid.D_ALA);


            File tmp = File.createTempFile("peptide", ".mol", new File("/tmp"));
            MDLV2000Writer writer = new MDLV2000Writer(new FileWriter(tmp));
            writer.write(m.getStructures().iterator().next().getStructure());
            writer.close();
            System.out.println(tmp);
        }
        {
            Metabolite m =
                       factory.generateMetabolite(PeptideFactory.AminoAcid.L_ILE, PeptideFactory.AminoAcid.D_ALA);

            File tmp = File.createTempFile("peptide", ".mol", new File("/tmp"));
            MDLV2000Writer writer = new MDLV2000Writer(new FileWriter(tmp));
            writer.write(m.getStructures().iterator().next().getStructure());
            writer.close();
            System.out.println(tmp);
        }

    }
}
