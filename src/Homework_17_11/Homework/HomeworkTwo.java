package Homework_17_11.Homework;

public class HomeworkTwo {
    public static void main(String[] args) {
        String before="one    two    three    four     five";
        String after = before.trim().replaceAll(" +", " ");
        System.out.println(after);
    }
}
