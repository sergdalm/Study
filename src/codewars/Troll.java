package codewars;

//  A function that takes a string and return a new string with all vowels removed.

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]" , "");
    }
}