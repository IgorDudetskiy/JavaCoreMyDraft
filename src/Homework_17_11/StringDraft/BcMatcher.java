package Homework_17_11.StringDraft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BcMatcher {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(.(.(.)))");
        Matcher m = p.matcher("abcabcabc");
        while (m.find())
        {
            System.out.println("Найдено " + m.group(2));
            System.out.println("  начинается с позиции " + m.start(2) +
                    " и заканчивается на позиции " + (m.end(2) - 1));
            System.out.println();
        }
        /*Найдено bc
        начинается с позиции 1 и заканчивается на позиции 2
        Найдено bc
        начинается с позиции 4 и заканчивается на позиции 5
        Найдено bc
        начинается с позиции 7 и заканчивается на позиции 8
    */}
}
