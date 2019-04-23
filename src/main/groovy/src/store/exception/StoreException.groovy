package src.store.exception

class StoreException extends Exception {
    private static final long serialVersionUID = 1L;

    StoreException() {
        super()
    }

    StoreException(String message) {
        super(message)
    }

    StoreException(Exception e) {
        super(e)
    }

    StoreException(String message, Exception e) {
        super(message, e)
    }
}
