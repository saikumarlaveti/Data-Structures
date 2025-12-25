package RevisionTopics.MultiThreading;

public class Class_3 implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=5;i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        Class_3 r = new Class_3(); // Runnable interface does not start method
        Thread t = new Thread(r); // thread class have start method
        t.start();
        for(int i = 1;i<=5;i++){
            System.out.println("Parent Thread");
        }
    }
}
