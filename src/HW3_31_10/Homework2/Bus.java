package HW3_31_10.Homework2;

public class Bus extends GroundVehicle{
    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    String route;

    public Bus(String route) {
        this.route = route;
    }
    public void drive(){
        System.out.println("Drive from Bus");
    }
}
