package Demo_CI1.exceptions;

/**
 * Exception non-vérifiée
 */

public class UnexpectedException extends RuntimeException{
    public UnexpectedException(){super();}

    public UnexpectedException(String m){super(m);}

}
