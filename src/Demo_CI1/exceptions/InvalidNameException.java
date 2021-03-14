package Demo_CI1.exceptions;

/**
 * Exception vérifiée pour des noms invalides
 */
public class InvalidNameException extends Exception {
    public InvalidNameException(){
        super();
    }

    public InvalidNameException(String m){
        super(m);
    }
}
