package Homework_29_11;

public class MainMyEnum {
    public static void main(String[] args) {
        for(MyEnum s:MyEnum.values()){
            System.out.println(s+" - "+ s.getColor());
        }
        MyEnum m = MyEnum.Second;

        switch(m) {
            case First:
                System.out.println("First");
                break;
            case Second:
                System.out.println("Second");
                break;
            case Thirth:
                System.out.println("Thirth");
                break;
            case Null:
                System.out.println("Null");
                break;
        }
        System.out.println(MyEnum.First==MyEnum.First);
        System.out.println(MyEnum.First.toString());

        for (MyEnum me : MyEnum.values()){
            if (me.hasColor()){
                System.out.println(me+" has current, It`s "+ me.getColor());
            }else{
                System.out.println(me+"has no color");
            }
        }
    }
}
