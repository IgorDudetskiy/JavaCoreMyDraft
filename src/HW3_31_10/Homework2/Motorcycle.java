package HW3_31_10.Homework2;

public class Motorcycle extends GroundVehicle{
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    int maxSpeed;

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void drive(){
        System.out.println("Drive from Motorcycle");
    }
}
