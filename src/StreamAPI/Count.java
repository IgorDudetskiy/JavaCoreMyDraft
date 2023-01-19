package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Count {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList("Tom", "Sam", "Bob", "Alice"));
        System.out.println(names.stream().count());  // 4
        // count() возвращает количество элементов в потоке данных:

        // количество элементов с длиной не больше 3 символов
        System.out.println(names.stream().filter(n->n.length()<=3).count());  // 3

        Optional<String> first = names.stream().findFirst();//findFirst() извлекает из потока первый элемент
        System.out.println(first.get());    // Tom

        Optional<String> any = names.stream().findAny();//findAny() извлекает случайный объект из потока
        System.out.println(any.get());
    }
}
