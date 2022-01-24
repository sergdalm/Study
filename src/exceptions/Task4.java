package exceptions;

public class Task4 {
    public static void main(String[] args) {
        try{
            method(120);
        } catch (RuntimeException exc) {
            System.out.println("Exception was caught");
        }
    }

    static void method(int i) {
        if(i > 100)
            throw new MyRuntimeException("This number is too big");
    }
}
