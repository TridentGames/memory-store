package com.oop.memorystore.implementation.query;

import com.oop.memorystore.implementation.query.imp.IndexContains;
import com.oop.memorystore.implementation.query.imp.IndexMatch;
import java.util.ArrayList;
import java.util.List;

public class QueryImpl implements BasicQuery, AndQuery, OrQuery {
    private final List<IMatchable> indexMatches = new ArrayList<>();
    private Operator operator;

    protected QueryImpl() {
    }

    @Override
    public AndQuery and(final String indexName, final Object key) {
        this.indexMatches.add(new IndexMatch(indexName, key));
        this.operator = Operator.AND;
        return this;
    }

    @Override
    public AndQuery containsAnd(final String indexName, final Object key) {
        this.indexMatches.add(new IndexContains(indexName, key));
        this.operator = Operator.AND;
        return this;
    }

    @Override
    public OrQuery or(final String indexName, final Object key) {
        this.indexMatches.add(new IndexMatch(indexName, key));
        this.operator = Operator.OR;
        return this;
    }

    @Override
    public OrQuery containsOr(final String indexName, final Object key) {
        this.indexMatches.add(new IndexContains(indexName, key));
        this.operator = Operator.OR;
        return this;
    }

    @Override
    public QueryDefinition build() {
        return new QueryDefinition(this.indexMatches, this.operator);
    }
}
