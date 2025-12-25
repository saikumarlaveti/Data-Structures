package RevisionTopics.MultiThreading;

 class saikumar extends Thread{
        public void run(){
            for(int i = 0;i<10;i++){
                System.out.println("Child Thread");
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public class JoinMethod {
        public static void main(String[] args) throws InterruptedException {
            saikumar s = new saikumar();
            s.start();
            s.join();
            for(int i = 0;i<10;i++){
                System.out.println("Parent Thread");
            }
        }
    }

