package Homework_17_11.PracticalTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String snp = "Dudetskiy Igor Serhiyovych";
        String surInit = snp.substring(0,9);

        int indexBeg = snp.indexOf(" ");
        int indexBeg2 = snp.indexOf(" ",indexBeg+1);
        char i = snp.charAt(indexBeg+1);
        char s = snp.charAt(indexBeg2+1);
        System.out.println(indexBeg);
        System.out.println(indexBeg2);
        int indexBeg3 = snp.indexOf(" ",indexBeg2+1);
        System.out.println(indexBeg3);

        StringBuilder sb =  new StringBuilder(surInit);
        sb.append(" "+ i+"."+s+".");

        String str = sb.toString();
        System.out.println( "str = "+str);

        String surInit1 = snp.substring(indexBeg+1,indexBeg2+1);
        System.out.println("surInit = " + surInit1);

        String nameMid = snp.substring(indexBeg,snp.length());

        StringBuilder nM = new StringBuilder(nameMid);
        nM.append(" "+surInit);
        String nml = nM.toString( );
        System.out.println(nml);


    }
}
