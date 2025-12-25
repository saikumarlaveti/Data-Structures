package RevisionTopics.MultiThreading;

class MyThread_2 extends Thread{
    @Override
    public void run() {
      for(int i = 0;i<1000;i++){
          System.out.println("I am Lazy Round -" + i);
      }
        System.out.println("I want to sleep");
      try{
          Thread.sleep(5000);
      }
      catch (InterruptedException e){
          System.out.println("Thread Interrupted");
      }
    }
}
public class InterruptedDemo {
    public static void main(String[] args) {
        MyThread_2 mt = new MyThread_2();
        mt.start();
        mt.interrupt();
        System.out.println("End of the main");
    }
}
