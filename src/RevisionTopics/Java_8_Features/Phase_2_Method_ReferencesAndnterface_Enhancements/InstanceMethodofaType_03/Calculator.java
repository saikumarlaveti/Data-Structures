package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.InstanceMethodofaType_03;

import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Calculator {
    public static void main(String[] args) {
        String name = "Sakumar";
        name.startsWith("s");
        BiFunction<Integer,Integer,Integer> maxValue =Integer::max;
        System.out.println(maxValue.apply(2,3));

        Function<String,String> upper = String::toUpperCase;
        System.out.println(upper.apply("saikumar"));

        //wrong answer
     //   Predicate<String> check = String::startsWith("s");

    }
}
