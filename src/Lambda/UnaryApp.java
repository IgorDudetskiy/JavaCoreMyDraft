package Lambda;

import java.util.function.UnaryOperator;

public class UnaryApp {
    public static void main(String[] args) {

        UnaryOperator<String> square = x -> x+x;
        System.out.println(square.apply("5")); // 55
    }
}
//UnaryOperator<T> принимает в качестве параметра объект типа T,
// выполняет над ними операции и возвращает результат операций в виде объекта типа T: