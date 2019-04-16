package com.epam.test_task_ihg.store.factory;

import com.epam.test_task_ihg.store.HotelsStore;

public class HotelsStoreFactory {

    private static final HotelsStoreFactory instance = new HotelsStoreFactory();

    private final HotelsStore hotelsStore = new HotelsStore();

    private HotelsStoreFactory() {
    }

    public static HotelsStoreFactory getInstance() {
        return instance;
    }

    public HotelsStore getHotelsStore() {
        return hotelsStore;
    }
}
