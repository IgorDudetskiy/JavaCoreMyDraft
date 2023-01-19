package StreamAPI.SubStreamMerge;

import java.util.stream.Stream;

public class ConcatApp {
    public static void main(String[] args) {

        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");

        Stream.concat(people1, people2).forEach(n -> System.out.println(n));
    }
}
