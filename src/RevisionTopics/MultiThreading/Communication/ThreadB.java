package RevisionTopics.MultiThreading.Communication;

public class ThreadB extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Child Thread starting calculating");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child Thread Given notification to the main Method");
            this.notify();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("its over " + i);
        }
    }
}