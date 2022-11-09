package samples_31_10;
import java.util.ArrayList;
import java.util.List;
public class MainAnimal {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<Animal>();

        list.add(new Cat());
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Dog());

        for (Animal animal : list) {
            animal.voice();
            animal.feed();
        }
    }
}
