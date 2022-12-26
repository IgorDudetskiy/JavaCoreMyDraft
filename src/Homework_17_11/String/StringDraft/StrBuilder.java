package Homework_17_11.String.StringDraft;

public class StrBuilder {

    public static void main(String[] args) {
        String s1 = new String("Hello ");
        String s2 = "And Goodbye";
        String str = s1 + s2;
        str = s1.concat(s2);

        StringBuilder sb =  new StringBuilder(s1);
        sb.append(s2);
        str = sb.toString( );

        StringBuffer sa = new StringBuffer( );
        sa.append(s1);
        sa.append(s2);
        String str2 =  sa.toString( );



    }


}
