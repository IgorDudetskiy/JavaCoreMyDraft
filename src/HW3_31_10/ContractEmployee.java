package HW3_31_10;

public class ContractEmployee extends Employee implements Payment {


    public ContractEmployee(String name, int averageMonthlySalary) {
        super();
        this.averageMonthlySalary = averageMonthlySalary;
        this.name = name;
    }

    public ContractEmployee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name = "Second child";
    String federalTaxIdmember = "5656788989";

    int fixedMonthlyPayment = 2000;

    @Override
    public int calculatePay() {
        int averageMonthlySalary = fixedMonthlyPayment;
        return averageMonthlySalary;

    }
    public String toString() {
        return "Employee [One of the children= " + getName() + ", federalTaxIdmember = " + federalTaxIdmember + ", averageMonthlySalary= " + calculatePay() + "]";
    }


}

