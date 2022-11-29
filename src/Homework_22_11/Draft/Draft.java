package Homework_22_11.Draft;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Draft {
    public static void main(String[] args) {
        HashMap<String,Object> map=new HashMap<String,Object>();
        Set<Map.Entry<String,Object>> entrySet=map.entrySet();

        map.put("123", "Mama");
        map.put("234", "Mila");
        map.put("345", "Ramu");
        System.out.println(map);

        Object desiredObject=new Object();//что хотим найти
        for (Map.Entry<String,Object> pair : entrySet) {
            if (desiredObject.equals(pair.getValue())) {
                System.out.println(pair.getValue());
                //return pair.getKey();// нашли наше значение и возвращаем  ключ
            }
        }
    }
}

