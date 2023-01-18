package Lambda;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierApp {

    public static void main(String[] args) {

        Supplier<User> userFactory = ()->{

            Scanner in = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Name user1: " + user1.getName());
        System.out.println("Name user2: " + user2.getName());
    }
}
class User{

    private String name;
    String getName(){
        return name;
    }

    User(String n){
        this.name=n;
    }
}