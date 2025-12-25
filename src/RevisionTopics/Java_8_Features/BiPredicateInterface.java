package RevisionTopics.Java_8_Features;

import java.util.function.BiPredicate;

public class BiPredicateInterface {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> ref = (a,b) -> (a+b)%2 == 0;
        System.out.println(ref.test(2,3));
        System.out.println(ref.test(2,2));

    }
}
