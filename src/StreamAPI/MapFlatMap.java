package StreamAPI;

import java.util.stream.Stream;

class Phone {

    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class MapFlatMap {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream.filter(p -> p.getPrice() < 50000).forEach(p -> System.out.println(p.getName()));

        System.out.println("");

        Stream<Phone> phoneStream1 = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        // method map() - позволяет задать функцию преобразования одного объекта в другой,
        // то есть получить из элемента одного типа элемент другого типа.
        //Для преобразования объектов в типы Integer, Long, Double определены специальные методы mapToInt(), mapToLong() и mapToDouble()
        phoneStream1
                .map(p-> p.getName()) // помещаем в поток только названия телефонов
                .forEach(s->System.out.println(s));

        System.out.println("");
        Stream<Phone> phoneStream2 = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        //когда из одного элемента нужно получить несколько. Данную операцию выполняет метод flatMap:
        phoneStream2
                .flatMap(p->Stream.of(
                        String.format("name: %s  cost without discount: %d", p.getName(), p.getPrice()),
                        String.format("name: %s  cost with discount: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))
                ))
                .forEach(s->System.out.println(s));
    }




}
