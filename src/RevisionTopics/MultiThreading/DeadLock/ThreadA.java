package RevisionTopics.MultiThreading.DeadLock;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b){
            System.out.println("ThreadA calling ThreadB");
            b.wait();
            System.out.println("Got information from ThreadB");
        }
    }
}
