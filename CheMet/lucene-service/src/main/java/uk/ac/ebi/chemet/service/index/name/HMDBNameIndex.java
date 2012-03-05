package uk.ac.ebi.chemet.service.index.name;

import uk.ac.ebi.chemet.service.index.KeywordNIOIndex;

/**
 * HMDBNameIndex - 21.02.2012 <br/> Description...
 *
 * Index is used in HMDLMetabocardsLoader and HMDBNameService
 *
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
public class HMDBNameIndex extends DefaultNameIndex {
    public HMDBNameIndex(){
        super("HMDB Names", "name/hmdb");
    }
}