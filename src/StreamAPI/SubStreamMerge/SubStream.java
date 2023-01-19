package StreamAPI.SubStreamMerge;

import java.util.stream.Stream;

public class SubStream {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.takeWhile(n -> n < 0)// takeWhile() выбирает из потока элементы, пока они соответствуют условию.
                .forEach(n -> System.out.println(n));
        System.out.println("");

        Stream<Integer> numbers1 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers1.sorted().takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));
        System.out.println("");

        Stream<Integer> numbers2 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers2.sorted().dropWhile(n -> n < 0)//dropWhile() выполняет обратную задачу - он пропускает элементы потока, которые соответствуют условию до тех пор
                .forEach(n -> System.out.println(n));

        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.println(p));
        //Метод distinct() возвращает только ункальные элементы в виде потока:
    }
}