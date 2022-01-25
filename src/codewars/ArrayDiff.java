package codewars;

/**
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
 *
 * It should remove all values from list a, which are present in list b keeping their order.
 */
public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        if(b.length == 0)
            return a;

        int bValueCount = 0;

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j])
                    bValueCount++;
            }
        }

        int[] a2 = new int[a.length - bValueCount];

        int count = 0;
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < b.length; j++) {
                if(a[i] != b[j])
                    a2[count++] = a[i];
            }
        return a2;
    }
}