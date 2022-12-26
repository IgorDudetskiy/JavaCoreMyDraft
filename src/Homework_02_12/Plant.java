package Homework_02_12;

import java.util.Arrays;
import java.util.List;

import static Homework_02_12.ColorException.doColor;
import static Homework_02_12.TypeException.doType;
public class Plant {
    int size;
    Color color;
    Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    enum Color {
        BLUE("BLUE"), GREEN("GREEN"), RED("RED"), PURPLE("PURPLE"), YELLOW("YELLOW");

        Color(String color) {
        }
    }
    enum Type {
        HERBS("HERBS"), SHRUBS("SHRUBS"), TREES("TREES"), CLIMBERS("CLIMBERS"), CREEPERS("CREEPERS");

        Type(String type) {
        }
    }
}
class ColorException extends Throwable {
    static void doColor(Plant.Color color) throws ColorException {
        for (Plant.Color c : Plant.Color.values()) {
            if (Plant.Color.valueOf(c.name()).equals(color)) {

                System.out.println("Color exists");
            } else {
                throw new ColorException();
            }System.out.println(c.name());
        }
//        List<Plant.Color> plantColors = Arrays.asList(Plant.Color.values());
//        if(plantColors.contains(color)){
//            System.out.println("Color exist "+ color.toString());
//        }else {
//            throw new ColorException();
//        }
    }
}

class TypeException extends Throwable {
    static void doType(Plant.Type type) throws TypeException {

        for (Plant.Type c : Plant.Type.values()) {
            if (Plant.Type.valueOf(c.name()).equals(type)) {
                System.out.println("Type exists");
                System.out.println(Plant.Type.valueOf("f"));
            } else {
                throw new TypeException();
            }
        }
//        List<Plant.Type> plantTypes = Arrays.asList(Plant.Type.values());
//        if(plantTypes.contains(type)){
//            System.out.println("Type exist "+type.toString());
//        }else {
//            throw new TypeException();
//        }
    }
}

class MainPlant {
    public static void main(String[] args)  {

        try {
            doType(Plant.Type.valueOf("HERBS"));
            //doColor(Plant.Color.valueOf("RED"));
       //    System.out.println("Color isn't exist");
        }catch (TypeException t){
            System.out.println("Type isn't exist");
        }catch (IllegalArgumentException i){
            System.out.println("IllegalArgumentException");
        }
        //System.out.println(Plant.Color.valueOf("RED"));
    }

}
