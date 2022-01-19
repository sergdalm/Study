package codewars;
/*
    You are going to be given an array of integers.
    Your job is to take that array and find an index N
    where the sum of the integers to the left of N is
    equal to the sum of the integers to the right of N.
    If there is no index that would make this happen, return -1.
 */

public class EqualsIndex {
    public static int findEvenIndex(int[] arr) {
        int sumRight;
        int sumLeft;
        int sum = 0;

        // Check if sum of array is 0
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        if(sum == 0)
            return 0;


        for(int i = 0; i < arr.length; i++) {
            sumRight = 0;
            sumLeft = 0;

            for(int j = 0; j < i; j++)
                sumRight += arr[j];

            for(int j = i + 1; j < arr.length; j++)
                sumLeft += arr[j];

            if (sumLeft == sumRight)
                return i;
        }
        return -1;
    }
}
