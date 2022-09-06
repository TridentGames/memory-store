package com.oop.memorystore.implementation.query.imp;

import com.oop.memorystore.implementation.query.IMatchable;

public class IndexContains implements IMatchable {
    private String indexName;
    private Object key;

    protected IndexContains() {}

    public IndexContains(final String indexName, final Object key) {
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
