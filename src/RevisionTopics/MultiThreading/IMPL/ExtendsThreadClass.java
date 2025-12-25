package RevisionTopics.MultiThreading.IMPL;

class ExtendsThreadClass extends  Thread{
    public void run(){
        int i = 1;
        while(i<=10){
            System.out.println("demo class : " + i);
            i++;
        }
    }
    public static void main(String[] args) {
        ExtendsThreadClass d = new ExtendsThreadClass();
        d.start();
        int i = 1;
        while(i<=10){
            System.out.println("main class :" +i);
            i++;
        }
    }
}