package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterApp {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Paris", "London", "Madrid");
        cities.stream() // получаем поток
                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
                .forEach(System.out::println); // выводим отфильтрованные строки на консоль

//        ArrayList<String> cities1 = new ArrayList<String>();
//        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");

        System.out.println("");
        Stream<String> citiesStream = cities.stream(); // получаем поток
        citiesStream = citiesStream.filter(s->s.length()!=6); // применяем фильтрацию по длине строки
        citiesStream.forEach(System.out::println); // выводим отфильтрованные строки на консоль

        //метод Arrays.stream(T[] array), который создает поток данных из массива:
        Stream<String> citiesStream1 = Arrays.stream(new String[]{"Paris", "London", "Madrid"}) ;
        citiesStream1.forEach(System.out::println);

        IntStream intStream = Arrays.stream(new int[]{1,2,4,5,7});
        intStream.forEach(System.out::println);

        //способ создания потока представляет статический метод of(T..values)
        Stream<String> citiesStream2 =Stream.of("Paris", "London", "Madrid");
        citiesStream2.forEach(System.out::println);

    }
}
