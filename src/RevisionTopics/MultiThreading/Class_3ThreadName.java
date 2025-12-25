package RevisionTopics.MultiThreading;


class  Class_3ThreadName{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); // main
        Thread.currentThread().setName("Hello");
        System.out.println(Thread.currentThread().getName()); // Hello
    }
}
