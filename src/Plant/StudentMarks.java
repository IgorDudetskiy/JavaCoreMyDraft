package Plant;

import java.util.Scanner;

public class StudentMarks {
    Scanner scan1 = new Scanner(System.in);
    private double math;
    private double science;
    private double english;
    public StudentMarks(double math, double science, double english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }
    public static boolean wasPromroted(StudentMarks marks) {
        if(marks.math>=85 && marks.science>=75 && marks.english>=65)
            return true;
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your math score: ");
        double math = sc.nextDouble();
        System.out.println("Enter your science score: ");
        double science = sc.nextDouble();
        System.out.println("Enter your english score: ");
        double english = sc.nextDouble();
        StudentMarks marks = new StudentMarks(math, science, english);
        boolean bool = wasPromroted(marks);
        if(bool) {
            System.out.println("Congratulations you've got promoted");
        } else {
            System.out.println("Sorry try again");
        }
    }
}