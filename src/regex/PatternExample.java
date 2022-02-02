package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher("123");
        System.out.println(matcher.matches());

        String phoneNumber = "+375 (29) 898-12-13";
        String regex = "(\\+375)? ?\\(\\d{2}\\) ?\\d{3}-\\d{2}-\\d{2}";
        System.out.println(Pattern.matches(regex, phoneNumber));

        Pattern patternPhineNumber = Pattern.compile("(\\+375)? ?\\(\\d{2}\\) ?\\d{3}-\\d{2}-\\d{2}");
        Matcher matcherPhone = patternPhineNumber.matcher(phoneNumber);
        System.out.println(matcherPhone.matches());
        System.out.println(phoneNumber.matches((regex)));
    }
}
