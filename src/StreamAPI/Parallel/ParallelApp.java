package StreamAPI.Parallel;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ParallelApp {
    public static void main(String[] args) {

        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.parallel().reduce((x, y)-> x*y);
        System.out.println(result.get()); // 720

        List<String> people = Arrays.asList("Tom","Bob", "Sam", "Kate", "Tim");

        System.out.println("Serial stream");
        people.stream().filter(p->p.length()==3).forEach(System.out::println);

        System.out.println("\nParallel stream ");
        people.parallelStream().filter(p->p.length()==3).forEach(System.out::println);

        Stream<Integer> numbersStream1 = Stream.of(1, 2, 3, 4, 5, 6);
        Integer result1 = numbersStream1.parallel().reduce(1, (x,y)->x * y);
        System.out.println(result1);
    }
}
//Чтобы сделать обычный последовательный поток параллельным, надо вызвать у объекта Stream метод parallel.
// Кроме того, можно также использовать метод parallelStream() интерфейса Collection для создания параллельного потока из коллекции.