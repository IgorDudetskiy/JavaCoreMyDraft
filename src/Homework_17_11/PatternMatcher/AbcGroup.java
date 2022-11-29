package Homework_17_11.PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbcGroup {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(.(.(.)))");
        Matcher m = p.matcher("abc");
        m.find();
        System.out.println(m.groupCount());
        for (int i = 0; i <= m.groupCount(); i++)
            System.out.println(i + ": " + m.group(i));
        /*3
        0: abc
        1: abc
        2: bc
        3: c
 */


    }
}
