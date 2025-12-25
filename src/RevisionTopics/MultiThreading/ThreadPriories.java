package RevisionTopics.MultiThreading;

class Demo extends Thread{
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("Child Thread");
        }
    }
}
public class ThreadPriories {
    public static void main(String[] args) {
     Demo d = new Demo();
     d.setPriority(10);
     d.start();
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(d.getPriority());
        for(int i = 1;i<=10;i++){
            System.out.println("main Thread");
        }
    }
}
