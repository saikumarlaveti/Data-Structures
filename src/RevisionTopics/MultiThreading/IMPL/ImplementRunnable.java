package RevisionTopics.MultiThreading.IMPL;

public class ImplementRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=10;i++){
            System.out.println("Run method() :" + i);
        }

    }

    public static void main(String[] args) {
        ImplementRunnable ir = new ImplementRunnable();
        Thread t = new Thread(ir);
        t.start();
        for(int i = 1;i<=10;i++){
            System.out.println("Method method() :" + i);
        }
    }
}
