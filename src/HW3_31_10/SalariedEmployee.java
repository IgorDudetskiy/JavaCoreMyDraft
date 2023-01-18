package HW3_31_10;

public class SalariedEmployee extends Employee implements Payment {

    public SalariedEmployee(String name, int averageMonthlySalary) {
        super();
        this.averageMonthlySalary = averageMonthlySalary;
        this.name = name;
    }
    public SalariedEmployee() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String name = "One of the children";
    public String socialSecurityNumper = "2344567890";
    int hourlyRate = 2;
    int hours = 8;
    @Override
    public int calculatePay() {
        return (hourlyRate * hours) * 30;
    }
    public String toString() {
        return "Employee [One of the children= " + getName() + ", socialSecurityNumper= " + socialSecurityNumper + ", averageMonthlySalary= " + calculatePay() + "]";
    }


}
