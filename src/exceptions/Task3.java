package exceptions;

public class Task3 {
    public static void main(String[] args) {
        try{
            MyExceptionClass3.method(5);
        } catch (MyException exc) {
            System.out.println(exc.getMessage());
            System.out.println(exc.getCause());
            exc.printStackTrace();
        }
    }
}

class MyExceptionClass3 {
    public static void method(int i) throws MyException {
        if (i < 10)
            throw new MyException(new RuntimeException());
    }
}
