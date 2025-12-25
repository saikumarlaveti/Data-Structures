package RevisionTopics.Java_8_Features;



public class MethodReference {
    public void m1(){
        for (int i = 0; i < 10; i++)
            System.out.println("Child Thread");
    }
    public static void main(String[] args) {
        MethodReference mr = new MethodReference();
        Runnable runnable  = mr ::m1;
        Thread t = new Thread(runnable);
        t.start();
        for (int i = 0; i < 10; i++)
            System.out.println("parent Thread");
}
}
