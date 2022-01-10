package strings;

public class replaceRunner {
    public static void main(String[] args) {
        String str = "Hello world";
        String s1 = "world";
        String s2 = "everyone";

        String str2 = str.replace(s1, s2);
        System.out.println(str2);

    }
}
