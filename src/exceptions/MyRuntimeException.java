package exceptions;

public class MyRuntimeException extends RuntimeException{

    public MyRuntimeException(String s) {
        System.err.println("Exception: " + s);
    }

    public MyRuntimeException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "MyRuntimeException";
    }
}
