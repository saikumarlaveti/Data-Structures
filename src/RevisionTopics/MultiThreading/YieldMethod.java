package RevisionTopics.MultiThreading;

class test extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
public class YieldMethod {
    public static void main(String[] args) {
        test t = new test();
        t.start();
        for(int i = 0;i<10;i++){
            System.out.println("Parent Thread");
        }
    }
}
