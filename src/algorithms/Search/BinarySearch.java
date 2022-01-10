package algorithms.Search;

public class BinarySearch {
    public static boolean search(int[] array, int n) {
        if(array.length == 0)
            return false;
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        return searchFun(array, firstIndex, lastIndex, n);
    }

    private static boolean searchFun(int[] array, int firstIndex, int lastIndex, int n) {
        if(lastIndex - firstIndex == 1)
            return array[firstIndex] == n || array[lastIndex] == n;
        int avarage = firstIndex + (lastIndex - firstIndex) / 2;
        if(array[avarage] > n)
            return searchFun(array, firstIndex, avarage, n);
        return searchFun(array, avarage, lastIndex, n);
    }
}
