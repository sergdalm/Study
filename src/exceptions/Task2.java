package exceptions;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try{
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.err.println("ArrayIndexOutOfBoundsException was caught!");
        }
    }
}
