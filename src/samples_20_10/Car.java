package samples_20_10;

import java.util.ArrayList;

public class Car {

    String model = "Skoda";
    int maxSpeed = 260;
    int yearOfManufacture = 2018;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Car() {
        this.model = "KIA";
    }

    public void run() {
        System.out.println("Run run");
    }

    public void stop() {
        System.out.println("Stop stop");
    }

    public String toString() {
        return "samples_20_10.Car model = " + model + ", Max speed = " + maxSpeed + ", Year of manafacture = " + yearOfManufacture;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Truck truck = new Truck();
        Sedan sedan = new Sedan();
        cars.add(sedan);
        cars.add(truck);
        sedan.stop();
        truck.run();
        System.out.println(sedan);
        System.out.println(truck);
    }
}

