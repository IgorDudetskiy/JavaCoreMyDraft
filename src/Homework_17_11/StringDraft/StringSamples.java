package Homework_17_11.StringDraft;

public class StringSamples {
    public static void main(String... args) {
        final double PI = 3.1415926;
        String format = "%.2f";
        String s = String.format(format, PI);
        System.out.println(s);
        System.out.printf(format, PI);
    }
}
