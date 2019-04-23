package src.util.exception

class UtilException extends Exception{
    private static final long serialVersionUID = 1L;

    UtilException() {
        super()
    }

    UtilException(String message) {
        super(message)
    }

    UtilException(Exception e) {
        super(e)
    }

    UtilException(String message, Exception e) {
        super(message, e)
    }

}
