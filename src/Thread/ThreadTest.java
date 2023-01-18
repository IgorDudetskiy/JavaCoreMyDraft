package Thread;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("1");
        go();
        System.out.println("2");
    }

    public void go() {
        /*try {
            Thread.sleep(2000);

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }*/
        doMore();
    }

    public void doMore() {
        System.out.println("top stek");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("Be back in method main");
    }

}
