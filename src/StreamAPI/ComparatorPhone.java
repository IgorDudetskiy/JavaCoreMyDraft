package StreamAPI;

import java.util.Comparator;
import java.util.stream.Stream;

class Phone1 {
    private String name;
    private String company;
    private int price;

    public Phone1(String name, String comp, int price) {
        this.name = name;
        this.company = comp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }
}
public class ComparatorPhone {

    public static void main(String[] args) {

        Stream<Phone1> phoneStream = Stream.of(new Phone1("iPhone X", "Apple", 600),
                new Phone1("Pixel 2", "Google", 500),
                new Phone1("iPhone 8", "Apple",450),
                new Phone1("Nokia 9", "HMD Global",150),
                new Phone1("Galaxy S9", "Samsung", 300));

        phoneStream.sorted(new PhoneComparator())
                .forEach(p->System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice()));

    }
}
class PhoneComparator implements Comparator<Phone1> {

    public int compare(Phone1 a, Phone1 b){

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}
