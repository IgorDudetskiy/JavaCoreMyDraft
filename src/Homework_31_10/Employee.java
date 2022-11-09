package Homework_31_10;

public  class Employee implements Payment{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void setAverageMonthlySalary(int averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public String name;
    public int averageMonthlySalary;
    public String employeeld;


    public Employee(String name, int averageMonthlySalary) {
        this.name = name;
        this.averageMonthlySalary = averageMonthlySalary;
    }


    public Employee() {
    }


    @Override
    public int calculatePay() {
        return 0;
    }
}
