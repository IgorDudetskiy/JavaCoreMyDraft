package Thread;
import java.util.concurrent.Semaphore;
public class SemaphoreApp {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1); // 1 разрешение
        CommonResourceSemaphore res = new CommonResourceSemaphore();
        new Thread(new CountThreadSemaphore(res, sem, "CountThread 1")).start();
        new Thread(new CountThreadSemaphore(res, sem, "CountThread 2")).start();
        new Thread(new CountThreadSemaphore(res, sem, "CountThread 3")).start();
    }
}
class CommonResourceSemaphore {
    int x = 0;
}
class CountThreadSemaphore implements Runnable {
    CommonResourceSemaphore res;
    Semaphore sem;
    String name;
    CountThreadSemaphore(CommonResourceSemaphore res, Semaphore sem, String name) {
        this.res = res;
        this.sem = sem;
        this.name = name;
    }
    public void run() {
        try {
            System.out.println(name + " wait permission");
            sem.acquire();//Для получения разрешения у семафора надо вызвать метод acquire()
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " releases permission");
        sem.release();//полученное ранее разрешение надо освободить с помощью метода release():
    }
}
