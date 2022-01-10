package algorithms.Search;

public class LinearSearch {
    public static boolean search(int[] array, int n) {
        for(int i = 0; i < array.length; i++)
            if(array[i] == n)
                return true;
        return false;
    }
}
