package strings;

public class StringDemo {
    public static void main(String[] args) {
        char[] chars = {'H', 'l', 'o'};
        String str1 = new String(chars, 0, 3);
        String str2 = new String(str1);
        System.out.println(str2 + " " + str2);
        System.out.println(str2 + " " + str2);
    }
}
