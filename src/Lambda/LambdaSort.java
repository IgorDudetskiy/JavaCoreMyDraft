package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaSort {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " +
                "before sorting : " + al);

        // using lambda expression in place of comparator object
        al.sort(Comparator.reverseOrder());
        System.out.println("Elements of the ArrayList after" +
                " reverseOrder() : " + al);
        al.sort(Comparator.naturalOrder());

        System.out.println("Elements of the ArrayList after" +
                " naturalOrder() : " + al);


    }
}
