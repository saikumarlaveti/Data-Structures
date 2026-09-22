package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.StaticMethodReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Calculator {
    public static int squre(int n1){
        return n1 * n1;
    }
    public static String wish(){
        return "Hi Saikumar Laveti";
    }

    public static void main(String[] args) {
        //normally method call
        System.out.println(Calculator.squre(2));  //4

        // using static method reference first it will store result like variable
        Function<Integer,Integer> result = Calculator::squre;

        //using static method reference
        System.out.println(result.apply(2)); //4

        Supplier<String> greet = Calculator::wish;
        System.out.println(greet.get());

    }
}
