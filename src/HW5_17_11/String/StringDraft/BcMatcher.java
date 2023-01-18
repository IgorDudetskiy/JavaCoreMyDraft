package HW5_17_11.String.StringDraft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BcMatcher {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(.(.(.)))");
        Matcher m = p.matcher("abcabcabc");
        while (m.find())
        {
            System.out.println("������� " + m.group(2));
            System.out.println("  ���������� � ������� " + m.start(2) +
                    " � ������������� �� ������� " + (m.end(2) - 1));
            System.out.println();
        }
        /*������� bc
        ���������� � ������� 1 � ������������� �� ������� 2
        ������� bc
        ���������� � ������� 4 � ������������� �� ������� 5
        ������� bc
        ���������� � ������� 7 � ������������� �� ������� 8
    */}
}
