package uk.ac.ebi.mdk.tool.match;

import uk.ac.ebi.mdk.domain.annotation.crossreference.CrossReference;
import uk.ac.ebi.mdk.domain.entity.AnnotatedEntity;
import uk.ac.ebi.mdk.domain.identifier.Identifier;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author John May
 */
public class CrossReferenceMatcher<E extends AnnotatedEntity> implements EntityMatcher<E> {

    @Override
    public Boolean matches(E query, E subject) {

        // extract identifiers to avoid corrupting the #equals() methods in CrossReference.
        // if we changed them so that KEGGCompoundCrossReference could matches CrossReference
        // we might get unexpected behaviour in maps
        Collection<Identifier> queryXrefs   = getIdentifiers(query.getAnnotationsExtending(CrossReference.class));
        Collection<Identifier> subjectXrefs = getIdentifiers(subject.getAnnotationsExtending(CrossReference.class));

        // add self
        queryXrefs.add(query.getIdentifier());
        subjectXrefs.add(subject.getIdentifier());

        // find match
        for(Identifier reference : queryXrefs){
            if(subjectXrefs.contains(reference)){
                return true;
            }
        }

        return false;

    }

    private Collection<Identifier> getIdentifiers(Collection<CrossReference> references){

        Collection<Identifier> identifiers = new HashSet<Identifier>();

        for(CrossReference reference : references ){
            identifiers.add(reference.getIdentifier());
        }

        return identifiers;

    }

}