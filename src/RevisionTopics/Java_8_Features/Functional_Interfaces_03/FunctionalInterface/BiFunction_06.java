package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction_06 {
    public static void main(String[] args) {

        BiFunction<String,String,String> wish = (wish1,wish2) -> "Good " + wish1 + " " + wish2;
        //1.apply( )
        System.out.println(wish.apply("Morning ","Santosh "));   // Good Morning  Santosh
        System.out.println(wish.apply("Night","Saikumar Laveti"));  // Good Night Saikumar

        //2.andThen( )
        BiFunction<Integer,Integer,Integer> result1 =  (a,b)-> a+b;  //2+3 = 5
        Function<Integer,Integer> result2 =  (c)-> c*c;  // 5 * 5 = 25

        System.out.println(result1.andThen(result2).apply(2,3));  //25



    }
}
