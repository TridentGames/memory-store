package com.oop.memorystore.api;

/**
 * Expiring store contains values that can expire after x time
 */
public interface ExpiringStore<V> extends Store<V> {

    /**
     * Get expiration manager
     */
    ExpirationManager<V> getExpirationManager();

    /**
     * Invalidate expired references
     */
    void invalidate();

}
