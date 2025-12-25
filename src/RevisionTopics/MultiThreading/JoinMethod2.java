package RevisionTopics.MultiThreading;

class MyThread_1 extends Thread{
    static Thread mt;
    public void run(){
        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 1;i<10;i++){
            System.out.println("Child Thread");
        }
    }
    }

public class JoinMethod2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread_1.mt = Thread.currentThread();
        MyThread_1 ct = new MyThread_1();
        ct.start();
       // ct.join();  // if i un comment this statement deadlock will happen because myThread class also calls join() method()
        for(int i = 1;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(200);
        }
    }
}
