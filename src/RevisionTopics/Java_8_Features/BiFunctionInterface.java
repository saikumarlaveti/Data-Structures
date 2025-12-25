package RevisionTopics.Java_8_Features;

import java.util.function.BiFunction;

public class BiFunctionInterface {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> ref = (a,b) -> (a+b);
        System.out.println(ref.apply(2,3));
        System.out.println(ref.apply(100,200));
    }
}

