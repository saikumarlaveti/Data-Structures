package RevisionTopics.Java_8_Features;

   class LambdaExpressions{
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            System.out.println("Main Thread");
        }
        Runnable r1 = () ->{
            for(int i =1;i<5;i++){
                System.out.println("Hello World");
            }
        };
        r1.run();
    }
}
