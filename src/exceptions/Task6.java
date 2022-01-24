package exceptions;

import java.util.Map;
import java.util.Random;

public class Task6 {
    private static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new IndexOutOfBoundsException("runtime"),
            1, new IllegalArgumentException("file no found"),
            2, new ArithmeticException("index exception")
    );

    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        } catch (IndexOutOfBoundsException exc) {
            System.out.println(1);
            exc.printStackTrace();
        } catch (IllegalArgumentException exc) {
            System.out.println(2);
            exc.printStackTrace();
        } catch (ArithmeticException exc) {
            System.out.println(3);
            exc.printStackTrace();
        } catch (Throwable throwable) {
            System.out.println("Another exception");
            throwable.printStackTrace();
        }
    }

    public static void unsafe(int randomValue) throws Throwable{
        throw EXCEPTIONS.getOrDefault(randomValue, new MyRuntimeException("Not found"));
    }
}

