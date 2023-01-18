package HW1_17_10;

import java.io.IOException;

public class Number {
    public static void main(String[] args) throws IOException {

        int i = 1;
        int number = 12345678;

        while (number > 10) {
            if (number > 10) {
                number = number / 10;
            } else if (number <= 0) {
                number = number;
            }
            i++;
        }
        System.out.println(i);

        int number2 = 12345678;

        while (number2 >= 1) {
            if (number2 >= 1) {
                int number3 = number2 % 10;
                number2 = number2 / 10;
                System.out.print(number3);
            } else if (number2 <= 0) {
                number2 = number2;
            }
            i++;
        }
        System.out.println(" ");

        int number3 = 12345678;

        while (number3 >= 1) {
            int number4 = number3 % 10;
            number3 = number3 / 10;
            if (number4 > 4) {
                System.out.println("The number is greater than 4 = " + number4);
            }
        }
    }
}