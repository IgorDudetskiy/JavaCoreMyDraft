package HW4_13_11_InnerClasses.Lambda;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(22);
        list.add(-2);
        list.add(232);
        list.add(224);
        list.add(12);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator() {
            public int compare(Object o1,Object o2){
                int a=((Integer)o1);
                int b=((Integer)o2);
                return a<b?1:a==b?0:-1;
            }
        });
        System.out.println(list);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Integer n1: list1) {
            System.out.print(n1+"");}

        System.out.println("");

            List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
            list2.forEach(n2 -> System.out.print(n2+""));

        System.out.println("");

        list1.forEach(System.out::print);



    }

}
