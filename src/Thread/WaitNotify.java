package Thread;

public class WaitNotify {

    public static void main(String[] args) {

        Store store=new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
// Класс Магазин, хранящий произведенные товары
class Store{
    private int product=0;
    public synchronized void get() {
        while (product<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Consumer bought 1 product");
        System.out.println("Product in store: " + product);
        notify();//notify(): продолжает работу потока, у которого ранее был вызван метод wait()
    }
    public synchronized void put() {
        while (product>=3) {
            try {
                wait();//wait(): освобождает монитор и переводит вызывающий поток
                // в состояние ожидания до тех пор, пока другой поток не вызовет метод notify()
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Producer add 1 product");
        System.out.println("Products in store: " + product);
        notify();
    }
}
// класс Производитель
class Producer implements Runnable{

    Store store;
    Producer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
// Класс Потребитель
class Consumer implements Runnable{

    Store store;
    Consumer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}
