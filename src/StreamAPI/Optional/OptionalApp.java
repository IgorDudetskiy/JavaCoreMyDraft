package StreamAPI.Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class OptionalApp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        if (min.isPresent()) {//это предварительная проверка наличия значения в Optional с помощью метода isPresent()
            System.out.println(min.get());
        } // 1
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        Optional<Integer> min1 = numbers1.stream().min(Integer::compare);
        System.out.println(min1.orElse(-1)); // -1
        //Метод orElse() позволяет определить альтернативное значение, которое будет возвращаться,
        // если Optional не получит из потока какого-нибудь значения

// непустой список
        numbers1.addAll(Arrays.asList(4, 5, 6, 7, 8, 9));
        min = numbers1.stream().min(Integer::compare);
        System.out.println(min.orElse(-1)); // 4

        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        Optional<Integer> min3 = numbers3.stream().min(Integer::compare);
        Random rnd = new Random();
        System.out.println(min3.orElseGet(() -> rnd.nextInt(100)));
        //Метод orElseGet() позволяет задать функцию, которая будет возвращать значение по умолчанию:

        // генеррация исключения IllegalStateException
        System.out.println(min.orElseThrow(IllegalStateException::new));
        //orElseThrow позволяет сгенерировать исключение, если Optional не содержит значения:

        ArrayList<Integer> newA = new ArrayList<>();
        ArrayList<Integer> numbers4 = new ArrayList<Integer>();
        numbers4.addAll(Arrays.asList(4,5,6,7,8,9));
        Optional<Integer> min4 = numbers4.stream().min(Integer::compare);
        min4.ifPresent(v->newA.add((Integer) v)); // 4
        // ifPresent() определяет действия со значением в Optional, если значение имеется:
        min.ifPresentOrElse(//ifPresentOrElse() позволяет определить альтернативную логику на случай, если значение в Optional отсутствует:
                v -> System.out.println(v),
                () -> System.out.println("Value not found")
        );
        System.out.println(newA);
    }
}
