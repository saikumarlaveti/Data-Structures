package RevisionTopics.MultiThreading.IMPL;

public class ThreadPriorities implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("demo class : " + i);
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadPriorities tp = new ThreadPriorities();
        Thread t = new Thread(tp);
        Thread.currentThread().setPriority(5);
        System.out.println(Thread.currentThread().getPriority()); //5
        t.start();
        int i = 1;
        while (i <= 10) {
            System.out.println("Main class : " + i);
            i++;
        }
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority()); //10
    }
}