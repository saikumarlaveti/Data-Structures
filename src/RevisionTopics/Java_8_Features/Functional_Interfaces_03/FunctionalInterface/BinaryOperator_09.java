package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperator_09 {
    public static void main(String[] args) {
        //1.apply ( )
        BinaryOperator<String> details = (name,age) -> "My name is " + name + " age is  " + age;
        System.out.println(details.apply("LC_13_RomanToInteger","26")); // My name is LC_13_RomanToInteger age is  26

        //2.andThen( )
        BinaryOperator<Integer> addition = (a,b) -> a+b;
        Function<Integer,Integer> multiplication = (c) -> c*c;

        int result = addition.andThen(multiplication).apply(2,3); //25
        System.out.println(result);


    }
}
