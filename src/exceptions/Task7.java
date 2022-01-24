package exceptions;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        try{
            randomExc();
        } catch (ArithmeticException exc) {
            exc.printStackTrace();
        } finally {
            System.out.println("End of program.");
        }

    }

    static void randomExc() {
        Random random = new Random();
        int n = random.nextInt(3);
        if(n == 1)
            throw new ArithmeticException();
    }
}
