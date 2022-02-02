package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "+375 (25) 898-12-13dgdgdg+375 (29) 777-22-15" +
                "ffgfg+375 (33) 256-11-33dsff +375 (44) 458-65-17 dfdf";
        String regex = "(?:\\+375)? ?\\((?<code>\\d{2})\\) ?(\\d{3})-(\\d{2})-(\\d{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        StringBuilder stringBuilder = new StringBuilder();

        while(matcher.find()) {
            matcher.appendReplacement(stringBuilder, "$2 - $3 - $4");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder);
        System.out.println(phoneNumber.replaceAll(regex, "$2 - $3 - $4 |"));
    }
}
