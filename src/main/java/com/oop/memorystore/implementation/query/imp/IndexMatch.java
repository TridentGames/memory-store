package com.oop.memorystore.implementation.query.imp;

import com.oop.memorystore.implementation.query.IMatchable;

public class IndexMatch implements IMatchable {
    private String indexName;
    private Object key;

    protected IndexMatch() {}

    public IndexMatch(final String indexName, final Object key) {
        this.indexName = indexName;
        this.key = key;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public Object getKey() {
        return this.key;
    }
}
