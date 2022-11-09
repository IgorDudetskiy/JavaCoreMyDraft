package Homework_31_10;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee());
        list.add(new Employee());

        list.sort(new AverageMonthlySalaryComparator());
        for (Employee employee : list) {
            System.out.println(employee);
        }
        list.sort(new NameComparator());
        for (Employee employee : list) {
            System.out.println(employee);
        }
        //System.out.println(SalariedEmployee instanceof Employee);
    }
}

class AverageMonthlySalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return ((SalariedEmployee)o1).getAverageMonthlySalary()-(((ContractEmployee)o2).getAverageMonthlySalary());
    }
}
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1,Employee o2) {
        return ((ContractEmployee)o1).getName().compareTo(((SalariedEmployee)o2).getName());
    }
}