package Homework_22_11.Homework;

import java.util.*;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("q", "a");
        person.put("w", "s");
        person.put("e", "d");
        person.put("r", "f");
        person.put("t", "g");
        person.put("y", "h");
        person.put("u", "j");
        person.put("i", "k");
        person.put("o", "l");
        person.put("o", "l");
        System.out.println(person);

        String name = "i";

        Iterator<Map.Entry<String, String>> entries = person.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            if (entry.getKey().equals(name)) {
                entries.remove();
               // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }
        }
        System.out.println(person);
    }
}





