package Plant;

public class Main1 {
    // create a static variable
    static String staticVariable = "Static Variable";
    //create none static variable
    String nonStaticVariable = "Non Static Variable";

    public static void main(String args[]) {
        // Create an object of the class
        Main1 main_obj = new Main1();

        // Assign the non-static variable to the static variable
        Main1.staticVariable = main_obj.nonStaticVariable;

        // print the static variable
        System.out.println(Main1.staticVariable);
        // output:
        //Non Static Variable

    }
}