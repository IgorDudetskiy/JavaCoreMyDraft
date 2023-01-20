package StreamAPI.GroupCollect;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxMin {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple", 450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));


        Map<String, Optional<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.maxBy(Comparator.comparing(Phone::getPrice))));
//Методы maxBy и minBy применяются для подсчета минимального и максимального значения в каждой группе.
        for(Map.Entry<String, Optional<Phone>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue().get().getName());
        }
    }
}
