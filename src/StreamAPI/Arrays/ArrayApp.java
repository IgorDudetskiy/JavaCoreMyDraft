package StreamAPI.Arrays;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {

        int[] numbers = initializeArray(6);
        for(int i: numbers)
            System.out.println(i);

    }//parallelSetAll(): устанавливает элементы массива с помощью лямбда-выражения
    public static int[] initializeArray(int size) {
        int[] values = new int[size];
        Arrays.parallelSetAll(values, i -> i*10);
        return values;
    }
}
