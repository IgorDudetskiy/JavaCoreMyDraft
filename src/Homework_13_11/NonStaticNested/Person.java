package Homework_13_11.NonStaticNested;

public class Person {
    private FullName fullName = new FullName();

    public int getAge() {
        return age;
    }

    private int age;

    public String getFullName() {
        String fullNameS = fullName.firstName + " " + fullName.lastName;
        return fullNameS;
    }

    public Person(String firsName, String lastName, int age) {
        fullName.firstName = firsName;
        fullName.lastName = lastName;
        this.age = age;
    }

    // getters and setters


    private class FullName {
        private String firstName;
        private String lastName;

    }
}