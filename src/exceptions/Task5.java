package exceptions;

public class Task5 {
    public static void main(String[] args) {
        try {
            catchCastomException();
        } catch (MyRuntimeException exc) {
            System.out.println("MyRuntimeException was caught");
            exc.printStackTrace();
        }


    }

    public static void catchCastomException() {
        try {
            unsafe();
        } catch (RuntimeException exc) {
            System.out.println("Catch catchCastomException method");
            throw new MyRuntimeException(exc);
        }

    }
    public static void unsafe() {
        throw new RuntimeException("Ooops");
    }
}

