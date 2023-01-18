package HW6_22_11.Collection.Homework;


import java.util.*;

public class Student {

    public String name;
    public int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(ArrayList<Student> students, Integer course) {
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.print("Name = " + student.getName() + "; Course = " + student.getCourse());
            }
        }
    }

    @Override
    public String toString() {
        return "\n Name = " + getName() + "; Course = " + getCourse();
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 1));
        students.add(new Student("Petro", 2));
        students.add(new Student("Pavlo", 4));
        students.add(new Student("Andriy", 1));
        students.add(new Student("Luka", 3));
        //System.out.println(students);
        System.out.println(" ");
        Student.printStudents(students, 2);

        System.out.println("");

        students.sort(new NameComparator());
        for (Student student : students) {
            System.out.print(student);
        }
        System.out.println("");
        students.sort(new CourseComparator());
        for (Student student : students) {
            System.out.print(student);
        }
        System.out.println("");
        students.sort(Student::compareByNameThenCourse);
        for (Student student : students) {
            System.out.print(student);
        }

    }

    public static int compareByNameThenCourse(Student lhs, Student rhs) {
        if (lhs.name.equals(rhs.name)) {
            return Integer.compare(lhs.course, rhs.course);
        } else {
            return lhs.name.compareTo(rhs.name);
        }
    }
}


class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() - o2.getCourse();
    }
}

