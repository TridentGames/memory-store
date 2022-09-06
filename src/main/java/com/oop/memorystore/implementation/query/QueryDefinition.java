package com.oop.memorystore.implementation.query;

import java.util.List;

public class QueryDefinition {
    private final List<IMatchable> indexMatches;
    private final Operator operator;

    public QueryDefinition(final List<IMatchable> indexMatches, final Operator operator) {
        this.indexMatches = indexMatches;
        this.operator = operator;
    }

    public List<IMatchable> getIndexMatches() {
        return this.indexMatches;
    }

    public Operator getOperator() {
        return this.operator;
    }
}
