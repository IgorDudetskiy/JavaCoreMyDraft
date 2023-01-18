package HW3_31_10.Homework2;

public class Car extends GroundVehicle{
    String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void drive(){
        System.out.println("Drive from Car");
    }
}
