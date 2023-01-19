package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class AnyAllNoneMatch {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Tom", "Sam", "Bob", "Alice"));

        // есть ли в потоке строка, длина которой больше 3
        boolean any = names.stream().anyMatch(s->s.length()>3);
        System.out.println(any);    // true

        // все ли строки имеют длину в 3 символа
        boolean all = names.stream().allMatch(s->s.length()==3);
        System.out.println(all);    // false

        // НЕТ ЛИ в потоке строки "Bill". Если нет, то true, если есть, то false
        boolean none = names.stream().noneMatch(s-> Objects.equals(s, "Bill"));
        System.out.println(none);   // true
    }
}
