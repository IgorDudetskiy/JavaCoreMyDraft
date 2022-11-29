package Homework_17_11.StringDraft;

import java.util.Locale;

public class StringDraft {
    public static void main(String[] args) {
        String s1 = "sun.com";
        String s2 = new String("sun.com");

        char[] chA = {'A','B','c','d','e','f'};
        String strThird = new String(chA);
        String strFourth = new String(chA,2,4);//cdef
        //Basic methods
        String str3 = s1+s2;
        String str4 = s1.concat(s2);
        int str3Length = str3.length();

        String str = "I study Java language";
        int n = str.indexOf('J');//8
        char c = str.charAt(8);

        String str1 = str.substring(13);//language
        String str2 = str.substring(8,12);//Java

        Boolean res = str.startsWith("I study");//true
        Boolean res1 = str.startsWith("Java",8);//true
        Boolean res2 = str.endsWith("I study");//false

        String sr = str.toLowerCase();//i study java language
        String SR = str.toUpperCase();//I STUDY JAVA LANGUAGE

        String str5 = "\tTabulated       ghgh      String\t";//	Tabulated       ghgh      String
        String tStr = str5.trim();//Tabulated       ghgh      String

        String str6 ="abracadabra";
        String rStr2 =str6.replace('a','o');//obrocodobro

        String a = "a";
        String A = "A";
        String b = "a";
        //System.out.println(a.equals(A));//false
        //System.out.println(a.equals(b));//true
        //System.out.println(a.equalsIgnoreCase(A));//true
        //System.out.println(a.compareTo(A));//32
        //System.out.println(a.compareToIgnoreCase(A));//0



        int i;
        char s[ ] = { 'J', 'a', 'v', 'a' };
        String str7 = new String(s);      // str7 = "Java"
        if (!str7.isEmpty( )) {
            i = str7.length( );            // i = 4
            str7 = str7.toUpperCase( );     // str = "JAVA"
            String num = String.valueOf(8);   // num = "8"
            num = str7.concat(" - " + 8);  // num = "JAVA-8"
            char ch = str7.charAt(2);      // ch = 'V'
            i = str7.lastIndexOf('A');    // i = 3 or -1
            num = num.replace("8","SE"); // num = "JAVA-SE"
            str7.substring(0, 4).toLowerCase( );  // java
            str7 = num + " -8";         // str7 = "JAVA – SE - 8"
            System.out.println(str7);
           String[ ] arr = str7.split(" ");
            for (String w : arr) {
               System.out.println(w);
            }


    }
}
}
