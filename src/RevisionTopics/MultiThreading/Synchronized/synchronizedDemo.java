package RevisionTopics.MultiThreading.Synchronized;

 class MyThread extends Thread{
     display d;
     String name;
    MyThread(display d, String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.greet(name);
    }
}
class synchronizedDemo{
    public static void main(String[] args) {
        display d = new display();
        MyThread t1 = new MyThread(d, "Saikumar");
        MyThread t2 = new MyThread(d, "Santosh");
        t1.start();
        t2.start();
    }
 }