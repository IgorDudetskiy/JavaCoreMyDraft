package HW3_31_10.Homework2;

public class Boat extends WaterVehicle {
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    int volume;

    public Boat(int volume) {
        this.volume = volume;
    }
    public void isSailing() {
        System.out.println("IsSailing from Boat");
    }
}
