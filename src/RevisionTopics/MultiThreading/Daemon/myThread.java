package RevisionTopics.MultiThreading.Daemon;

class ThreadB extends  Thread{

}
public class myThread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon()); //false
        //Thread.currentThread().setDaemon(true); // throws IE
        ThreadB t = new ThreadB();
        System.out.println(t.isDaemon());//false
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}
