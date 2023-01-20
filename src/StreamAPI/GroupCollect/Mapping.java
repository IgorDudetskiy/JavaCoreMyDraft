package StreamAPI.GroupCollect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple", 450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));

        Map<String, List<String>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.mapping(Phone::getName, Collectors.toList())));

        for(Map.Entry<String, List<String>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(String name : item.getValue()){
                System.out.println(name);
            }
        }
    }
}
//mapping позволяет дополнительно обработать данные и задать функцию отображения объектов из потока на какой-нибудь другой тип данных.
//Выражение Collectors.mapping(Phone::getName, Collectors.toList()) указывает,
// что в группу будут выделятся названия смартфонов, причем группа будет представлять объект List.