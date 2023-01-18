package Thread;

class JThread extends Thread {
    JThread(String name){
        super(name);
    }
    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);//sleep(): приостанавливает поток на заданное количество миллисекунд
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}
public class ProgramThread {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread i = new JThread("JThread");
        i.start();
       // System.out.println("Main thread finished...");

        JThread t= new JThread("JThread  t ");
        t.start();
        try{
            t.join();//join(): ожидает завершение потока
        }
        catch(InterruptedException e){

            System.out.printf("%s has been interrupted", t.getName());
        }
        System.out.println("Main thread finished...");
    }
}