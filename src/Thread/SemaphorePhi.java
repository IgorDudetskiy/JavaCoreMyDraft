package Thread;

import java.util.concurrent.Semaphore;
public class SemaphorePhi {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(3);
        for (int i = 1; i < 6; i++)
            new Philosopher(sem, i).start();
    }
}
// класс философа
class Philosopher extends Thread {
    Semaphore sem; // семафор. ограничивающий число философов
    // кол-во приемов пищи
    int num = 0;
    // условный номер философа
    int id;

    // в качестве параметров конструктора передаем идентификатор философа и семафор
    Philosopher(Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
    }

    public void run() {
        try {
            while (num < 3)// пока количество приемов пищи не достигнет 3
            {
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire();
                System.out.println("Philosopher " + id + " sitting at the table");
                // философ ест
                sleep(500);
                num++;
                System.out.println("Philosopher " + id + " exit at the table");
                sem.release();
                // философ гуляет
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Philosopher " + id + " has problem with health");
        }
    }
}
