package Demo_CI1.exceptions;

public class EmptyException extends Exception {
    public EmptyException(){
        super();
    }

    public EmptyException(String m){
        super(m);
    }
}
