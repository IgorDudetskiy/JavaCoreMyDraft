package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class MaxMin {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.add(11);

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get());  // 1
        System.out.println(max.get());  // 9

        ArrayList<Phone2> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(new Phone2[]{
                new Phone2("iPhone 8", 52000),
                new Phone2("Nokia 9", 35000),
                new Phone2("Samsung Galaxy S9", 48000),
                new Phone2("HTC U12", 36000)
        }));

        Phone2 min2 = phones.stream().min(Phone2::compare).get();
        Phone2 max2 = phones.stream().max(Phone2::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min2.getName(), min2.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max2.getName(), max2.getPrice());
    }
}
class Phone2{

    private String name;
    private int price;

    public Phone2(String name, int price){
        this.name=name;
        this.price=price;
    }
    public static int compare (Phone2 p1, Phone2 p2){
        if(p1.getPrice() > p2.getPrice())
            return 1;
        return -1;
    }
    public String getName() { return name; }
    public int getPrice() { return price;}
}
