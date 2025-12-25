package RevisionTopics.MultiThreading.DeadLock;

public class ThreadB extends Thread{
    @Override
    public void run() {
        ThreadA a = new ThreadA();
        synchronized (this){
            System.out.println("ThreadB callling ThreadA");
            this.notify();

        }
    }
}
