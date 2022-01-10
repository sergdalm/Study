package strings;

public class StringDemo {
    static String arr[] = {
            "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their", "country"
    };

    public static void main(String[] args) {
        char[] chars = {'H', 'l', 'o'};
        String str1 = new String(chars, 0, 3);
        String str2 = new String(str1);
        System.out.println(str2 + " " + str2);
        System.out.println(str2 + " " + str2);

        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }

    }
}
