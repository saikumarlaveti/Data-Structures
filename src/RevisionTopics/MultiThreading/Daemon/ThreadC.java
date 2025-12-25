package RevisionTopics.MultiThreading.Daemon;

class ThreadD extends Thread{
    public void run(){
        for(int i= 1;i<=10;i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadC {
    public static void main(String[] args) {
        ThreadD d= new ThreadD();
        d.setDaemon(true); //---- Line - (1)
        d.start();
        System.out.println("Main Thread Terminated");
    }
}
