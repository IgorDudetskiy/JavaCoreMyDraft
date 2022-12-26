package Homework_29_11.Enum;

enum MyEnum {
    First("Yellow"),
    Second("Blue"),
    Thirth("Pirple"),
    Null("Null");


    private String color;
    MyEnum(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    boolean hasColor(){
        return  color!=null;
    }

}
