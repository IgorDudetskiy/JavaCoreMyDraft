package HW4_13_11_InnerClasses.NonStaticNested;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vasyl", "Petrenko", 25);

        String fullName = person.getFullName();
        int age = person.getAge();

        System.out.println(fullName + ", " + age + " years old");
    }
}
