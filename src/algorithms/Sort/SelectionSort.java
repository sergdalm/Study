package algorithms.Sort;

public class SelectionSort {
    public static void sort(int array[]) {
        if(array.length == 0) return;

        for(int i = 0; i < array.length; i++) {
            int smallest = array[i];
            int index = i;
            int j;
            for(j = i + 1; j < array.length; j++) {
                if(smallest > array[j]) {
                    smallest = array[j];
                    index = j;
                }
            }
            int tmp = array[i];
            array[i] = smallest;
            array[index] = tmp;
        }
    }
}
