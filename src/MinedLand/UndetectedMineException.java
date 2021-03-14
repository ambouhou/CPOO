package MinedLand;

public class UndetectedMineException extends RuntimeException {

    public UndetectedMineException(){
        super();
    }

    public UndetectedMineException(String m){
        super(m);
    }
}
