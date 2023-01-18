package HW6_22_11.Collection.Draft;

import java.util.HashMap;
import java.util.Map;

class Main {
    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        System.out.println(getKey(hashMap, 3));        // �������� `B`
    }
}