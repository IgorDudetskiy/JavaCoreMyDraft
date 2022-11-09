package samples_20_10;

public class Student1 {
    private String name;
    private int rating;

    int n = Student1.count;
    private static int count = 0;
    private static int sum = 0;

    public Student1() {
        count++;
    }
    public Student1(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setRating(int rating) {
        this.rating = rating;
        sum += rating;
    }
    public int getRating() {
        return rating;
    }
    public static double avgRating() {
        return sum / count;
    }
    public boolean betterStudent1(Student1 student) {
        return this.getRating() > student.getRating();
    }

    public String toString() {
        return "Student name = " + name + ", rating = " + rating + " ;";
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1("Nicholas", 22);
        Student1 student2 = new Student1("Christopher", 23);
        Student1 student3 = new Student1("Savl", 24);
        student1.setName("Ivan");
        student2.setName("Max");
        student3.setName("Pavlo");
        student1.setRating(25);
        student2.setRating(26);
        student3.setRating(27);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.printf("Average rating is %.2f", Student1.avgRating());
        System.out.println();
        System.out.println(student1.betterStudent1(student3));
        System.out.print("Student 1 has better rating than student 3 ");



    }
}


