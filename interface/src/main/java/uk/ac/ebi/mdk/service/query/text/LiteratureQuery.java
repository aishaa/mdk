package uk.ac.ebi.mdk.service.query.text;

import uk.ac.ebi.mdk.domain.text.Article;

import java.util.Collection;

/**
 * Query service provides searching of literature using a
 * string query
 *
 * @author  johnmay
 */
public interface LiteratureQuery {

    public Collection<Article> searchLiterature(String query);

}
