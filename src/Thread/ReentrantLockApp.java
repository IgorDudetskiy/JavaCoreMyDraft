package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockApp {

    public static void main(String[] args) {

        CommonResources commonResources= new CommonResources();
        ReentrantLock locker = new ReentrantLock(); // создаем заглушку
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThreads(commonResources, locker));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}

class CommonResources{

    int x=0;
}

class CountThreads implements Runnable{

    CommonResources res;
    ReentrantLock locker;
    CountThreads(CommonResources res, ReentrantLock lock){
        this.res=res;
        locker = lock;
    }
    public void run(){

        locker.lock(); // устанавливаем блокировку
        try{
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock(); // снимаем блокировку
        }
    }
}
