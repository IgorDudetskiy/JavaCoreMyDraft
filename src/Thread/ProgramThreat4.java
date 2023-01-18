package Thread;

class MyThread4 implements Runnable {

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!Thread.currentThread().isInterrupted()){

            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
public class ProgramThreat4 {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        MyThread4 myThread = new MyThread4();
        Thread t = new Thread(myThread,"MyThread");
        t.start();
        try{
            Thread.sleep(10);
            t.interrupt();

            Thread.sleep(10);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}
