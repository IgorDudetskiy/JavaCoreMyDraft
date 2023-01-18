package MyDraft;

public class VarArgs {

    // Метод vaTest() допускает переменное число аргументов
    static void vaTest(int ... v) {
        System.out.println("Amount arg: " + v.length);
        System.out.println("Container: ");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {

//         Метод vaTest() может вызываться с
//         переменным числом аргументов
        vaTest(1);        // 1 аргумент
        vaTest(1, 2, 3);  // 3 аргумента
        vaTest();         // без аргументов
Dog dog = new Dog();

        System.out.println("Amount field: "+dog.getColumnCount());
    }

}
class Dog{
    private int size = 7;
    private int lengths = 8;

    public Dog(int size, int lengths) {
        this.size = size;
        this.lengths = lengths;

    }

    public Dog() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLength() {
        return lengths;
    }

    public void setLength(int length) {
        this.lengths = length;
    }
    public int getColumnCount() {
        return getClass().getDeclaredFields().length;
    }

}