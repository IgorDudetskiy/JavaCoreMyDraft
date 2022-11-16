package Homework_13_11.StaticNested;

public class Main {
    public static void main(String[] args) {
        Entity e1 = new Entity();
        Entity e2 = new Entity();
        Entity e3 = new Entity();

        System.out.println("Count of Entity objects = "
                + Entity.getCount());
    }
}
