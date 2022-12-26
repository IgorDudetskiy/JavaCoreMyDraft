import java.util.stream.*;
import java.util.*;
import java.util.function.*;
public class DemoStreamAPI {
    public static void TrainStream() {
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> ALL = new ArrayList<String>();
        System.out.println("Enter name: ");
        while (true) {
            System.out.print("name = ");
            s = scanner.nextLine();
            if (s.equals("")==true)
                break;
            ALL.add(s);
        }
        System.out.println();
        System.out.println("ALL = " + ALL); // Выводим массив введенных имен
        Predicate<String> fn;
        fn = (str) -> {
            if (str.charAt(0)=='A')
                return true;
            return false;
        }; // Определяем, что нам нужны имена, начинающиеся на 'A'
        Stream<String> stream = ALL.stream(); // Конвертация массива в поток строк
        Stream<String> resStream = stream.filter(fn); // Получаем список, отфильтрованный по предикату
        System.out.println("count = " + resStream.count());
    }
    public static void main(String[] args) {
        TrainStream();
    }
}