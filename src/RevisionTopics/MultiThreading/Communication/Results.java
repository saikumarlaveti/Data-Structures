package RevisionTopics.MultiThreading.Communication;

public class Results extends Thread {
    @Override
    public void run() {
        synchronized (this){
        System.out.println("Exams are completed");
        System.out.println("Papers are correction");
        System.out.println("Results Declared");
            this.notify();
    }
    }
}
