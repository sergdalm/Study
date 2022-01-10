package grokkingalgorithms;// Grokking algorithms 4.1
// Method for sum all elements in int array using recursion

public class ArraySumDemo {
    public static void main(String[] args) {
        int[] numArray = {1, 5, 5};
        int sum = ArraySumDemo.sum(numArray.length, numArray);
        System.out.println(sum);

        System.out.println(ArraySumDemo.sum(1));
    }

    // Recursive method
    static  int sum(int length, int... array) {
        if(array.length == 0)
            return 0;
        int index = 0;
        if(index == length)
            return index;
        else {
            index = length - 1;
            return array[index] + sum(index, array);
        }
    }
}
