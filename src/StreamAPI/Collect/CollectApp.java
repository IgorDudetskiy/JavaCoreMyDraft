package StreamAPI.Collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectApp {
    public static void main(String[] args) {
//method collect() - получить данные не в виде потока, а в виде обычной коллекции, например, ArrayList или HashSet.
        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List<String> filteredPhones = phones.stream()
                .filter(s->s.length()<10)
                .collect(Collectors.toList());

        Set<String> filteredPhones1 = phones.stream()
                .filter(s->s.length()<10)
                .collect(Collectors.toSet());

        for(String s : filteredPhones1){
            System.out.println(s);
        }
    }
}
