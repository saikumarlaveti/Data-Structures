package RevisionTopics.MultiThreading.Communication;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b){
            System.out.println("Main Thread Calling Child Thread");
            b.wait();
            System.out.println("Main Thread got notifiacation");
            System.out.println(b.total);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(" over " + i);
        }

        Results re = new Results();
        re.start();
        synchronized (re){
            System.out.println("ThreadA class calling Student class");
            System.out.println("This is ThreadA class waiting for Result class response");
            re.wait();
            System.out.println("Bye");
        }
    }
}
