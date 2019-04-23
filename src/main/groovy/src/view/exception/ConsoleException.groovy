package src.view.exception

class ConsoleException extends Exception{
    private static final long serialVersionUID = 1L;

    ConsoleException() {
        super()
    }

    ConsoleException(String message) {
        super(message)
    }

    ConsoleException(Exception e) {
        super(e)
    }

    ConsoleException(String message, Exception e) {
        super(message, e)
    }
}
