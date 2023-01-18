package HW4_13_11_InnerClasses.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicate {

    public static void main(String [] a)  {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.print("������� ��� �����: ");
        evaluate(list, (n)->true);

        System.out.print("�� ������� �� ������ �����: ");
        evaluate(list, (n)->false);

        System.out.print("����� ������ �����: ");
        evaluate(list, (n)-> n%2 == 0 );

        System.out.print("����� �������� �����: ");
        evaluate(list, (n)-> n%2 == 1 );

        System.out.print("����� ����� ������ 5: ");
        evaluate(list, (n)-> n > 5 );

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
        list2.stream().map((x) -> x*x).forEach(System.out::println);
        System.out.println("");

        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7);
        int sum = list3.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
        System.out.println(sum);

    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }


}
