package RevisionTopics.MultiThreading.IMPL;

public class GetAndSetNamesOfThread {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        Thread.currentThread().setName("Saikumar");
        System.out.println(Thread.currentThread().getName());
    }
}
