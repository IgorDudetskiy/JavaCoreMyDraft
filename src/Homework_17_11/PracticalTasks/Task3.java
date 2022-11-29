package Homework_17_11.PracticalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo ");
        cars.add("B(*^%MW65_ ");
        cars.add("Ford ");
        cars.add("Ma&*(zda ");
        cars.add("KRAZ ");
        //System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            cars.get(i);
            // System.out.println(cars.get(i));
            String pattern = "[\\w\\s]";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(cars.get(i));
            while (m.find()) {
                System.out.print(cars.get(i).substring(m.start(), m.end()));
            }
        }
    }
}
