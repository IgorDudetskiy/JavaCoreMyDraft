package HW6_22_11.Collection.samples_10_11;
@FunctionalInterface
public interface FunctionInterf {
    double getValue();
    default void printInfo(){
      //  System.out.println("Info");
    }
}
