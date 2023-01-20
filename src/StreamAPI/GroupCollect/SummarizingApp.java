package StreamAPI.GroupCollect;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class SummarizingApp {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple", 450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));

        Map<String, IntSummaryStatistics> priceSummary = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany,
                        Collectors.summarizingInt(Phone::getPrice)));

        for(Map.Entry<String, IntSummaryStatistics> item : priceSummary.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue().getAverage());
        }
    }
}
//getAverage(): возвращает среднее значение
//
//getCount(): возвращает количество элементов в наборе
//
//getMax(): возвращает максимальное значение
//
//getMin(): возвращает минимальное значение
//
//getSum(): возвращает сумму элементов
//
//accept(): добавляет в набор новый элемент