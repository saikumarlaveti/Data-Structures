package RevisionTopics.MultiThreading.Synchronized;

public class display {
    public void greet(String name) {
    ;;;;;;;// 1000 lines of code
        synchronized (display.class) {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Good Morning :" + name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        ;;;;;;;// 1000 lines of code
    }
}