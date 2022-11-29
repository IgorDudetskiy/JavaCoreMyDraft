package Homework_22_11.Draft;

import java.util.*;

public class SetDraft {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
        System.out.println("");
        for (String text : set)
        {
            System.out.println(text);
        }
    }
}
