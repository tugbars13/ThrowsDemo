public class BallanceInsufficentException extends Exception{
    String message ;
    public BallanceInsufficentException (String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
