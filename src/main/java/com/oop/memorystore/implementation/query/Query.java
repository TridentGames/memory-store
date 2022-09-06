package com.oop.memorystore.implementation.query;

public interface Query {
    /**
     * Create a new query
     *
     * @param indexName    index name
     * @param valueToMatch value to match
     * @return query
     */
    static BasicQuery where(final String indexName, final Object valueToMatch) {
        final QueryImpl query = new QueryImpl();
        query.and(indexName, valueToMatch);
        return query;
    }

    static BasicQuery contains(final String indexName, final Object valueToMatch) {
        final QueryImpl query = new QueryImpl();
        query.containsAnd(indexName, valueToMatch);
        return query;
    }

    /**
     * Build query definition
     *
     * @return definition
     */
    QueryDefinition build();
}
