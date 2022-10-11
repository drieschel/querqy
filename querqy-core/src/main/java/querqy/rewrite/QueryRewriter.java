/**
 * 
 */
package querqy.rewrite;

import java.util.Collections;
import java.util.Set;

import querqy.model.ExpandedQuery;
import querqy.model.RewrittenQuery;
import querqy.model.Term;

/**
 * <p>A query rewriter.</p>
 * <p>Query rewriter implementations shall guarantee to preserve the number of top-level query clauses of the
 * {@link ExpandedQuery#userQuery} when rewriting the query.</p>
 * 
 * @author rene
 *
 */
public interface QueryRewriter {
    
    Set<Term> EMPTY_GENERABLE_TERMS = Collections.emptySet();

    RewrittenQuery rewrite(final ExpandedQuery query);

    default RewrittenQuery rewrite(final ExpandedQuery query,
                                   final SearchEngineRequestAdapter searchEngineRequestAdapter) {
        return rewrite(query);
    }
}
