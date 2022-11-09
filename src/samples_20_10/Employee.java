package samples_20_10;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    private static int totalSum = 0;
    int n = Employee.count;
    private static int count = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee() {
        count++;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        count++;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        count++;
    }

    public int getSalary() {
        int salary = rate * hours;
        return salary;

    }
    public int changeRate(int rate) {
        int newRate = rate;
        return newRate;
    }

    public int getBonuses() {
        int bonus = getSalary() / 10;
        totalSum += this.getSalary() + bonus;
        return this.getSalary() + bonus;
    }

    public String toString() {
        return "Employee name = " + name + ", rate = " + rate + ", hours = " + hours + ", salary = " + getBonuses();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Nicholas", 100, 8);
        Employee employee2 = new Employee("Christopher", 90, 9);
        Employee employee3 = new Employee("Savl", 85, 10);
        employee1.changeRate(98);
        employee2.changeRate(96);
        employee3.changeRate(94);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Summation of all salaries " + totalSum);

    }
}
