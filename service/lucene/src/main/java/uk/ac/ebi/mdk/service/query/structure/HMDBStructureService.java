package uk.ac.ebi.mdk.service.query.structure;

import uk.ac.ebi.mdk.domain.identifier.HMDBIdentifier;
import uk.ac.ebi.mdk.service.index.structure.HMDBStructureIndex;

/**
 * ${Name}.java - 21.02.2012 <br/> MetaInfo...
 *
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
public class HMDBStructureService
            extends AbstractStructureQueryService<HMDBIdentifier> {

    public HMDBStructureService()  {
        super(new HMDBStructureIndex());
    }

    public HMDBIdentifier getIdentifier(){
        return new HMDBIdentifier();
    }

}
