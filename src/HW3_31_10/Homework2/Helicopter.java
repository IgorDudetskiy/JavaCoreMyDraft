package HW3_31_10.Homework2;

public class Helicopter extends FlyingVehicle{
    int weight;
    int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }
    public void fly(){
        System.out.println("Fly from Helicopter");
    }
    public void land(){
        System.out.println("Land from Helicopter");
    }
}
