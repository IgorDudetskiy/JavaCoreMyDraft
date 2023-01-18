package HW2_20_10;

public class Program1 {
    public static void main(String[] args) {
        Student st;//null
        Student st1 = new Student("Ivan","Ivanov",15,"ivanov","12234");
        st1.PrintInfo();
        st1.setFirstname(" Alex ");

        st1.PrintInfo();
        st1.setAge(9);
        System.out.println(st1.getAge());
        System.out.println(st1.getPassword());
    }
}
