package HW2_20_10;

import java.io.IOException;

public class Person {
    public Person() {
        count++;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    private String firstName;
    private String lastName;
    private int birthYear;
    private static int year = 2022;
    private static int age = 0;
    private static int count = 0;

    public int getAge() {
        int age = year - birthYear;
        return age;
    }

    public String input(String firstName, String lastName) {
        this.firstName =firstName;
        this.lastName = lastName;
        return firstName + lastName;
    }

    public void output() {

        System.out.printf(" First name is \n Last name is \n Birth year \n ", firstName, lastName, getAge());
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Hello. What is your name?");
        // String firstName = br.readLine();
        // System.out.println("Hello. What is your name?");
        //String lastName = br.readLine();

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input("Ruslan", "Malinovskyi");
        person2.input("Oleksandr ", "Zinchenko");
        person3.input("Roman", "Yaremchuk");
        person4.input("Oleksandr", "Karavayev");
        person5.input("Andriy", "Yarmolenko");

        person1.getAge();
        person1.output();
        // person2.changeName("Oleks ", "Zin");
        // person3.changeName("Rom", "Yarem");
        //person4.changeName("Oleks", "Karav");
        //person5.changeName("Andr", "Yarmo");


    }


}
