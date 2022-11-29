package Homework_22_11.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MyMap {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(123, "Mama");
        map.put(234, "Mila");
        map.put(345, "Ramu");
        map.put(456, "Nina");
        map.put(567, "Vika");
        map.put(678, "John");
        map.put(789, "Luka");

        System.out.print(map);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter your ID");
        int key = Integer.parseInt(br.readLine());

        if (map.containsKey(key)) {
            System.out.println(map.get(key));
        } else {
            System.out.println("Error");
        }

        System.out.println("\nEnter your name");
        String name = br.readLine();

        for (Integer key1 : getKeys(map, name)) {
            System.out.println(key1);
        }
    }

    private static Set<Integer> getKeys(Map<Integer, String> map, String name) {
        Set<Integer> result = new HashSet<>();
        if (map.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (Objects.equals(entry.getValue(), name)) {
                    result.add(entry.getKey());
                }
            }
        }
        return result;
    }
}

