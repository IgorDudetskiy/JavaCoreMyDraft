package samples_17_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first value");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the second value");
        int b = Integer.parseInt(br.readLine());

        int sum = a+b;
        int subtr = a-b;
        int mult = a*b;
        double divide = a/b;

        System.out.printf("addition: %d \n  subtraction: %d \n  multiplication: %d \n division \n", sum,subtr,mult,divide);

        System.out.println("How are you?");
        String answer = br.readLine();
        System.out.println("You are " + answer);

    }
}
