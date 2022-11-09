package Homework_31_10.Homework2;

public class Plane extends FlyingVehicle {
    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public void fly() {
        System.out.println("Fly from Plane");
    }

    public void land() {
        System.out.println("Land from Plane");
    }
}
