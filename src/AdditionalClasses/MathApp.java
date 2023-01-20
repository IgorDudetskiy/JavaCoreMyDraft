package AdditionalClasses;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius circle ");
        int radius = in.nextInt();
        long area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.printf("Flat circle with radius %d equal %d \n", radius, area);
    }
}
