package src.service.exception

class ServiceException extends Exception {
    private static final long serialVersionUID = 1L;

     ServiceException() {
        super()
    }

     ServiceException(String message) {
        super(message)
    }

     ServiceException(Exception e) {
        super(e)
    }

     ServiceException(String message, Exception e) {
        super(message, e)
    }
}
