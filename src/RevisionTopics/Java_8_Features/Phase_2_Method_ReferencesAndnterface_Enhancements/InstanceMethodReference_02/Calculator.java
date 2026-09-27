package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.InstanceMethodReference_02;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Calculator {
    public void greet(String name){
        System.out.println("Good Morning " + name );
    }
    public int addition(int a){
        return a+a;
    }

    public int multiplication(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Consumer<String> result = c::greet;
        result.accept("Saikumar Laveti");

        Function<Integer,Integer> add = c::addition;
        System.out.println(add.apply(2));

        BiFunction<Integer,Integer,Integer> multi = c::multiplication;
        System.out.println(multi.apply(2,3));
    }
}
