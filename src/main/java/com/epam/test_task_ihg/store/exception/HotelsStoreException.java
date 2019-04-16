package com.epam.test_task_ihg.store.exception;

public class HotelsStoreException extends Exception {
    private static final long serialVersionUID = 1L;

    public HotelsStoreException() {
        super();
    }

    public HotelsStoreException(String message) {
        super(message);
    }

    public HotelsStoreException(Exception e) {
        super(e);
    }

    public HotelsStoreException(String message, Exception e) {
        super(message, e);
    }
}
