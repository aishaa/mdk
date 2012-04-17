package uk.ac.ebi.mdk.service.query.text;

import uk.ac.ebi.mdk.domain.text.Article;
import uk.ac.ebi.mdk.domain.text.TaggedArticle;

import java.util.Collection;

/**
 * Provides tagging of literature articles
 *
 * @author johnmay
 */
public interface LiteratureTaggingQuery {

    public Collection<TaggedArticle> tagArticles(Collection<Article> articles);

}
