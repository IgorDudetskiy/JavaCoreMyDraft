package Generics;

public class GenericsInterfaceApp {

    public static void main(String[] args) {

        Accountable<String> acc1 = new AccountA("1235rwr", 5000);
        AccountA acc2 = new AccountA("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());

        System.out.println();
        Account<String> acc1b = new Account<String>("1235rwr", 5000);
        Account<Integer> acc2b = new Account<>(888, 4300);
        System.out.println(acc1b.getId());
        System.out.println(acc2b.getId());

        System.out.println();
        AccountTS<String, Double> acc1ts = new AccountTS<String, Double>("354", 5000.87);
        String id = acc1ts.getId();
        Double sum = acc1ts.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);
    }
}
interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class AccountA implements Accountable<String>{

    private String id;
    private int sum;

    AccountA(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
class AccountB<T> implements Accountable<T>{

    private T id;
    private int sum;

    AccountB(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
class AccountTS<T, S>{

    private T id;
    private S sum;

    AccountTS(T id, S sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public S getSum() { return sum; }
    public void setSum(S sum) { this.sum = sum; }
}