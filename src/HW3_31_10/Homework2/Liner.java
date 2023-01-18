package HW3_31_10.Homework2;

public class Liner extends WaterVehicle{
    int floors;

    public Liner() {
    }

    public Liner(int floors) {
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void isSailing() {
        System.out.println("IsSailing from Liner");
    }

}
