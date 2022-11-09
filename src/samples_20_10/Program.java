package samples_20_10;

import java.sql.SQLOutput;

public class Program {

    public static void main(String[] args) {

        //System.out.println("My first program");
        for(int i=0; i<args.length; i++){
            System.out.println("Arg "+ i + " is " + args[i]);
        }
        int a = 12;
        int b = 13;

        int sum = a+b;
        double subtr = a-b;
        int mult = a*b;
        float divide = a/b;
        System.out.printf("sum=%d, subtr =%.2f , mult=%d , divide=%.2f ", sum,subtr,mult,divide);
        System.out.println("Time\\"+ "Time");

    }


}

