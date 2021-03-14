package Demo_CI1.exceptions;


public class FailureException extends RuntimeException {
    public FailureException(String m) {
        super(m);
    }
}
