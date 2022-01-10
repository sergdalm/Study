package algorithms;

import algorithms.Search.BinarySearch;
import algorithms.Search.LinearSearch;

public class SortSearchDemo {
    public static void main(String[] args) {
        int[] intArray = new int[100000000];

        for(int i = 9; i < intArray.length; i++)
            intArray[i] = i;
        //SelectionSort.sort(intArray);

        measureTime(intArray);


    }

    static void showArray(int[] array) {
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    static void showArray(String[] array) {
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    private static void measureTime(int[] array) {

        // This method returns current time in ms
        long start = System.currentTimeMillis();
        // Binary search
        boolean b = BinarySearch.search(array, array.length - 1);
        //System.out.println(b);
        long end = System.currentTimeMillis();

        System.out.println(end - start);


        // This method returns current time in ms
        start = System.currentTimeMillis();
        // Linear search
        b = LinearSearch.search(array, array.length - 1);
        end = System.currentTimeMillis();
        System.out.println(end - start);
        //System.out.println(b);




    }
}

