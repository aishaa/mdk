package uk.ac.ebi.chemet.service.query.name;

import org.apache.log4j.Logger;
import org.apache.lucene.search.Query;
import uk.ac.ebi.chemet.service.index.name.HMDBNameIndex;
import uk.ac.ebi.chemet.service.query.AbstractQueryService;
import uk.ac.ebi.resource.chemical.HMDBIdentifier;
import uk.ac.ebi.service.query.IUPACNameService;
import uk.ac.ebi.service.query.NameService;
import uk.ac.ebi.service.query.PreferredNameService;
import uk.ac.ebi.service.query.SynonymService;

import java.util.Collection;
import java.util.HashSet;

/**
 * HMDBNameQueryService - 23.02.2012 <br/>
 * <p/>
 * Class descriptions.
 *
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
public class HMDBNameQueryService
        extends AbstractQueryService<HMDBIdentifier>
        implements IUPACNameService<HMDBIdentifier>,
                   PreferredNameService<HMDBIdentifier>,
                   SynonymService<HMDBIdentifier>,
                   NameService<HMDBIdentifier>{

    public HMDBNameQueryService() {
        super(new HMDBNameIndex());
    }

    /**
     * @inheritDoc
     */
    @Override
    public Collection<HMDBIdentifier> searchName(String name, boolean approximate) {
        // use set as to avoid duplicates
        Collection<HMDBIdentifier> identifiers = new HashSet<HMDBIdentifier>();

        identifiers.addAll(searchIUPACName(name, approximate));
        identifiers.addAll(searchPreferredName(name, approximate));
        identifiers.addAll(searchSynonyms(name, approximate));

        return identifiers;

    }

    /**
     * @inheritDoc
     */
    @Override
    public Collection<String> getNames(HMDBIdentifier identifier) {
        // use set as to avoid duplicates
        Collection<String> names = new HashSet<String>();

        names.add(getIUPACName(identifier));
        names.add(getPreferredName(identifier));
        names.addAll(getSynonyms(identifier));

        return names;

    }

    /**
     * @inheritDoc
     */
    @Override
    public String getIUPACName(HMDBIdentifier identifier) {
        return getFirstValue(identifier, IUPAC);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Collection<HMDBIdentifier> searchIUPACName(String name, boolean approximate) {
        return getIdentifiers(create(name, IUPAC, approximate));
    }

    /**
     * @inheritDoc
     */
    @Override
    public Collection<HMDBIdentifier> searchPreferredName(String name, boolean approximate) {
        return getIdentifiers(create(name, PREFERRED_NAME, approximate));
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getPreferredName(HMDBIdentifier identifier) {
        return getFirstValue(identifier, PREFERRED_NAME);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Collection<HMDBIdentifier> searchSynonyms(String name, boolean approximate) {
        return getIdentifiers(create(name, SYNONYM, approximate));
    }

    /**
     * @inheritDoc
     */
    @Override
    public Collection<String> getSynonyms(HMDBIdentifier identifier) {
        return getValues(create(identifier.getAccession(), IDENTIFIER), PREFERRED_NAME);
    }

    /**
     * @inheritDoc
     */
    @Override
    public HMDBIdentifier getIdentifier() {
        return new HMDBIdentifier();
    }
}
