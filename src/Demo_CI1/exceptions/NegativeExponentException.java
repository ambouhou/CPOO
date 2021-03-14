package Demo_CI1.exceptions;

public class NegativeExponentException extends Exception {
    public NegativeExponentException(){
        super();
    }

    public NegativeExponentException(String m){
        super(m);
    }
}
