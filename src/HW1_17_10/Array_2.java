package HW1_17_10;

import java.util.Random;
import java.util.Scanner;

public class Array_2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount columns: ");
        int n = scan.nextInt();

        System.out.print("Enter amount rows");
        int m = scan.nextInt();

        int[][] mas = new int[n][m];
        Random rnd = new Random();
        int a = 0;
        int b = 0;
        System.out.println("Your array: ");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j< m; j++) {
                mas[i][j] = rnd.nextInt(10);
                System.out.print(mas[i][j] + " ");}
        }
        System.out.println("");
        System.out.println("Get the last line of the array: ");

        for (int i = n-1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
            System.out.println("Output the last element of the string: "+mas[n-1][m-1]);
        }
    }
}
