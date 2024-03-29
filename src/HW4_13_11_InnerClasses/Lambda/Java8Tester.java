package HW4_13_11_InnerClasses.Lambda;

public class Java8Tester {
    public static void main(String args[]) {

// without parenthesis
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

// with parenthesis
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    interface GreetingService {
        void sayMessage(String message);

    }

}
