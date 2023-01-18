package Lambda;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        Consumer<Integer> printer = x-> System.out.printf("%d dollars \n", x);
        printer.accept(600); // 600 долларов
    }
}
//Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая: