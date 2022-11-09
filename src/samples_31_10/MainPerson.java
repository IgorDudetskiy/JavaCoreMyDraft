package samples_31_10;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Teacher("Pavlo"));
        list.add(new Cleaner("Petro"));
        list.add(new Student("Timothy"));

        for (Person person : list) {
            person.print();

        }
        Person teacher = new Teacher("J");
        ((Teacher) teacher).salary();
        Person cleaner = new Cleaner("I");
        ((Cleaner) cleaner).salary();



    }
}

