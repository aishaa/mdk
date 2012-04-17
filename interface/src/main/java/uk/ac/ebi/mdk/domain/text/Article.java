package uk.ac.ebi.mdk.domain.text;

import java.util.Collection;

/**
 * Provides a description of an article
 * @author johnmay
 */
public interface Article {

    /**
     * Access the title of the article
     * @return
     */
    public String getTitle();

    // could return a journal object
    // journal -> website:url, access:enum(open,closed,unknown)
    public String getJournal();

    /**
     * Access the raw text of the article
     * @return
     */
    public String getRawText();

    /**
     * Access a collection of author
     * @return
     */
    public Collection<Author> getAuthors();
    
}
