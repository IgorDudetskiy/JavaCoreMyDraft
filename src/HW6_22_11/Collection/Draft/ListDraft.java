package HW6_22_11.Collection.Draft;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDraft {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Nick");
        names.add("Sara");

        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        names.listIterator(names.size());
        System.out.println("");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }
}
