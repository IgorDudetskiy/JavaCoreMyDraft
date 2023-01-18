package HW5_17_11.String.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkThree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence");
        String text = br.readLine();

        String pattern = "[$]\\w+(\\.\\w{2})";
        //String text = "$6543.3322";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end())+"*");
        }
    }

}

