package RevisionTopics.MultiThreading.Communication;

public class Student {
    public static void main(String[] args) throws InterruptedException {
        Results re = new Results();
        re.start();
        synchronized (re) {
            System.out.println("Student Waiting for result");
            re.wait();
            System.out.println("Student are happy");
        }
    }
}