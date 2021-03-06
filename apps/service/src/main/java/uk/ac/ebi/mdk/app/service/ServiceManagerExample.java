package uk.ac.ebi.mdk.app.service;

import org.apache.log4j.Logger;
import org.openscience.cdk.interfaces.IAtomContainer;
import uk.ac.ebi.mdk.domain.identifier.*;
import uk.ac.ebi.mdk.service.DefaultServiceManager;
import uk.ac.ebi.mdk.service.ServiceManager;
import uk.ac.ebi.mdk.service.query.structure.StructureService;

import java.util.Arrays;
import java.util.List;

/**
 * @author John May
 */
public class ServiceManagerExample {

    private static final Logger LOGGER = Logger.getLogger(ServiceManagerExample.class);

    public static void main(String[] args) {

        ServiceManager manager = DefaultServiceManager.getInstance();

        List<? extends Identifier> identifiers = Arrays.asList(new ChEBIIdentifier("CHEBI:15422"),
                                                               new KEGGCompoundIdentifier("C00009"),
                                                               new HMDBIdentifier("HMDB00538"),
                                                               new KEGGCompoundIdentifier("C00010"),
                                                               new ChEBIIdentifier("CHEBI:57299"),
                                                               new LIPIDMapsIdentifier("LMFA01010004"),
                                                               new BioCycChemicalIdentifier("ATP"),
                                                               new PubChemCompoundIdentifier("5957"),
                                                               new ChemSpiderIdentifier("5742"));


        System.out.printf("%-30s %-15s %-20s %-5s %s\n",
                          "Resource",
                          "Identifier",
                          "Service Type",
                          "Atoms",
                          "Time (s)");
        System.out.println();

        for (Identifier identifier : identifiers) {
            if (manager.hasService(identifier, StructureService.class)) {
                long start = System.currentTimeMillis();
                StructureService service = manager.getService(identifier, StructureService.class);
                long end = System.currentTimeMillis();
                IAtomContainer structure = service.getStructure(identifier);
                System.out.printf("%-30s %-15s %-20s %02d    %.3f\n",
                                  identifier.getShortDescription(),
                                  identifier,
                                  service.getServiceType(),
                                  structure.getAtomCount(),
                                  (end - start) / 1000f);

            }
        }

    }


}
