package Demo_CI1.exceptions;

/**
 * Exception vérifiée
 */
public class NotFoundException extends Exception {

    public NotFoundException(){
        super();
    }

    public NotFoundException(String m){
        super(m);
    }
}
