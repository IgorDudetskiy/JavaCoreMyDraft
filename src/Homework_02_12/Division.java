package Homework_02_12;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Division {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first value");
        String firstValue = br.readLine();

        System.out.println("Enter the second value");
        String secondValue = br.readLine();

        try {
            double firstNumber = Integer.parseInt(firstValue);
            double secondNumber = Integer.parseInt(secondValue);

            div(firstNumber, secondNumber);
            System.out.println("Result = " + div(firstNumber, secondNumber));
        } catch (NumberFormatException e) {
            System.out.println("You enter nonnumeric value");
        } catch (ArithmeticException e) {
            System.out.println("You enter negative value");
        }
        readNumber(1, 100);
    }

    public static double div(double firstNumber, double secondNumber) {
        if (secondNumber < 0) {
            throw new ArithmeticException();
        }
        return firstNumber / secondNumber;
    }

    public static void readNumber(int start, int end) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the third value");

            for (int i = 0; i < 10; i++) {
                String thirdValue = br.readLine();
                int thirdNumber = Integer.parseInt(thirdValue);
                if (thirdNumber > 1 && thirdNumber < 100) {
                    numbers.add(thirdNumber);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("You enter nonnumeric value");
        } catch (ArithmeticException e) {
            System.out.println("You enter negative value");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(numbers, (o1, o2) -> o1.compareTo(o2));
        System.out.println(numbers);

    }


}
