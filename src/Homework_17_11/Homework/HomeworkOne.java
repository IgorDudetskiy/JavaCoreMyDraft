package Homework_17_11.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkOne {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your sentence");
        String yourSentence = br.readLine();*/

        String yourSentence="one two three four five";
        String largeWord = max(yourSentence);
        System.out.println("Large word = " + largeWord);

        String[] arrWords = yourSentence.split(" ");
        String res = arrWords[1];
        System.out.println(res);

        StringBuilder sb =  new StringBuilder(res);
        System.out.println("Reverse = "+sb.reverse());

//        int indexBeg = yourSentence.indexOf(" ");
//        int indexBeg2 = yourSentence.indexOf(" ",indexBeg+1);
//        String surInit = yourSentence.substring(indexBeg+1,indexBeg2+1);
  //      System.out.println("Second word  = " + surInit);

//        StringBuilder sb =  new StringBuilder(surInit);
//        System.out.println("Reverse = "+sb.reverse());
    }

    public static String max(String sentence) {
        String[] words = sentence.split(" ");
        String space = "";
        for (String word : words) {
            if (word.length() > space.length())
                space = word;
           /* System.out.println(word+ " | "+space);
            //System.out.print(word+" ");
            System.out.println(space.length()+ "|||");*/
        }
        return (space);
    }
}
