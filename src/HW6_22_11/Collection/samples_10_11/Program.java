package HW6_22_11.Collection.samples_10_11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(13);
        list.add(54);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int a =((Integer)o1).intValue();
                int b =((Integer)o2).intValue();
                return a<b?1:a==b?0:-1;
            }
        });
    }

}
