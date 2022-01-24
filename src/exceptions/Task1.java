package exceptions;

public class Task1 {
    public static void main(String[] args) {
        Object o = null;
        try{
            o.toString();
        } catch (NullPointerException exc) {
            System.err.println("Exceptions was caught!");
            exc.printStackTrace();

        }
    }
}
