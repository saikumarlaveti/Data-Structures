package RevisionTopics.MultiThreading;

public class Case_6  extends Thread{
    public void start() {
        super.start();
        System.out.println("Start method");
    }
    public void run(){
        System.out.println("Run method");
    }
        public static void main(String[] args) {
            Case_6 c6 = new Case_6();
            c6.start();  // Start method
            System.out.println("main thread");
        }
    }

