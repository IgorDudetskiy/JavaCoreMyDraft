package samples_31_10;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Employee1 {
    public Employee1(int tabNumber, String name) {
        this.tabNumber = tabNumber;
        this.name = name;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int tabNumber;
    String name;
    static NameComparator nameComparator = new NameComparator();
    static TabComparator tabComparator = new TabComparator();

    public static Comparator getNameComparator() {
        return nameComparator;
    }

    public static Comparator getTabComparator() {
        return tabComparator;

    }

    public String toString() {
        return "Employee [tabNumber = " + tabNumber + ", name = " + name + "]";
    }

    static class NameComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Employee1) o1).getName().compareTo(((Employee1) o2).getName());
        }
    }

    static class TabComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Employee1) o1).getTabNumber() - ((Employee1) o2).getTabNumber();
        }
    }

    public static void main(String[] args) {
        Set<Employee1> set = new TreeSet(Employee1.getNameComparator());
        set.add(new Employee1(15, "Vasya"));
        set.add(new Employee1(2, "Anna"));
        set.add(new Employee1(40, "Alina"));
        System.out.println(set);

        Set<Employee1> set1 = new TreeSet(Employee1.getTabComparator());
        set1.addAll(set);
        System.out.println(set1);
    }

}
