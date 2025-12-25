package RevisionTopics.MultiThreading.IMPL;

public class WaitMethods {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            System.out.println("Student wrote exams :");
            System.out.println("Call to the Thread Class :");
            b.wait();
            System.out.println("main method execution over ::");
        }
    }
}

class ThreadB extends Thread {

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Thread Class ");
            }
            this.greet();
            System.out.println("Call to the main method :: ");
            this.notify();
        }
    }
        public void greet(){
            for (int i = 0; i <= 10; i++) {
                System.out.println("Greet Method :: ");
            }
    }
}