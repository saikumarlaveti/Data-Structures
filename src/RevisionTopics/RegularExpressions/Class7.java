package RevisionTopics.RegularExpressions;

import java.util.function.Consumer;


public class Class7 {
    public static void main(String[] args) {
        Consumer<Integer> demo = (n)->{
            for(int i=1;i<=n;i++){
                System.out.println("English - " + i);
            }
        };
        demo.accept(114);
    }
}



