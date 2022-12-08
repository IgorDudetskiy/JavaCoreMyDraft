package Homework_02_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first value");
        String firstValue =br.readLine();

        System.out.println("Enter the second value");
        String secondValue = br.readLine();

        try {
            int firstNumber = Integer.parseInt(firstValue);
            int secondNumber = Integer.parseInt(secondValue);

            squareRectangle(firstNumber, secondNumber);
            System.out.println("Result = "+ squareRectangle(firstNumber, secondNumber));
        }catch (NumberFormatException e){
            System.out.println("You enter nonnumeric value");
        }catch (ArithmeticException e) {
            System.out.println("You enter negative value");
        }
    }
    public static int squareRectangle ( int firstNumber, int secondNumber) {
        if(firstNumber<0 && secondNumber<0){
            throw new ArithmeticException();
        }
        return firstNumber*secondNumber;
    }
}