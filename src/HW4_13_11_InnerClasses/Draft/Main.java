package HW4_13_11_InnerClasses.Draft;

public class Main {

    public static void main(String[] args) {

        Bicycle peugeot = new Bicycle("Peugeot", 120,80);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat = peugeot.new Seat();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();
        seat.down();
        seat.getSeatParam();
    }
}
