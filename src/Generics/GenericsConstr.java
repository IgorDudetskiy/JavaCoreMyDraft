package Generics;

public class GenericsConstr {

    public static void main(String[] args) {

        AccountC acc1 = new AccountC("cid2373", 5000);
        AccountC acc2 = new AccountC(53757, 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

class AccountC{

    private String id;
    private int sum;

    <T>AccountC(T id, int sum){
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}