package querqy.lucene.rewrite.prms;

import java.io.IOException;

import org.apache.lucene.index.IndexReader;

/**
 * A query in the 'Probabilistic Retrieval Model for Semi-structured Data'
 *  
 * @author rene
 *
 */

public interface PRMSQuery {
    
    PRMSQuery NEVER_MATCH_PRMS_QUERY = indexReader -> 0.0;
    
    /**
     * Calculate the probability of this query for a given index
     *
     * @param indexReader The TndexReader
     * @return The probability of this query
     */
    double calculateLikelihood(IndexReader indexReader) throws IOException;

}
