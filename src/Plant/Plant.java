package Plant;

import java.util.Objects;

public class Plant {
    private Type type;
    private Color color;
    private String name;

    public Plant(String type, String color, String name) throws TypeException, ColorException{
        this.color = Color.valueOf(tryColor(color));
        this.type = Type.valueOf(tryType(type));
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "{type: " + type +
                ", color: " + color +
                ", name: " + name +
                '}';
    }
    public static String tryColor(String color) throws ColorException {
        switch(color.toUpperCase()) {
            case "WHITE":
                return color.toUpperCase();
            case "RED":
                return color.toUpperCase();
            case "BLUE":
                return color.toUpperCase();
            default:
                throw new ColorException(color);
        }
    }
    public static String tryType(String type) throws TypeException {
        switch(type.toUpperCase()) {
            case "RARE":
                return type.toUpperCase();
            case "ORDINARY":
                return type.toUpperCase();
            default:
                throw new TypeException(type);
        }
    }


    public static Plant tryCreatePlant(String type, String color, String name) {
        Plant plant = null;
        try {
            tryType(type);
            tryColor(color);
            return new Plant(type,color,name);
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        }
        return plant;
    }
}

class TypeException extends Exception{
    private String message;

    public TypeException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return "Invalid value "+ message +" for field type";
    }
}

class ColorException extends Exception {
    private String message;
    public ColorException(String message) {
        this.message=message;
    }
    @Override
    public String getMessage() {
        return "Invalid value "+ message +" for field color";
    }
}
enum Color {
    WHITE("White"),
    RED("Red"),
    BLUE("Blue");

    @Override
    public String toString() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    private Color(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    boolean hasColor(){
        return  color!=null;
    }

}
enum Type {
    RARE("Rare"),
    ORDINARY("Ordinary");

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    Type(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }
    boolean hasType(){
        return  type!=null;
    }

    @Override
    public String toString() {
        return type;
    }
}
class Main{
    public static void main(String[] args) throws ColorException, TypeException {
        Plant plant = new Plant("Rare","red","name");
        plant = Plant.tryCreatePlant("Rare","red","neam");
        System.out.println(plant);
    }
}