package Lambda;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        Function<Integer, String> convert = x-> String.valueOf(x) + " dollars";
        System.out.println(convert.apply(5)); // 5 долларов
    }
}
//Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R: