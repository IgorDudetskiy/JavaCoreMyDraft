package HW5_17_11.String.PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
    public static void main(String[] args) {
//String pattern = "[a-z]+";
//String text = "Now is the time";
//String pattern = "<.*>";
//String pattern = "<[^>]*>";
//String text = "<p><b>Beginning with bold text</b> next, text body,<i>italic text</i> end of text.</p>";
        String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
        String text = "my.mail.test@ua.ua";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) {
            System.out.print("Matches the entire text string");
        }
        m.reset();
        System.out.println();
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
        }
    }
}

