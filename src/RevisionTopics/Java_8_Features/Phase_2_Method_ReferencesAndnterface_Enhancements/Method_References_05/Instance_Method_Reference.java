package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.Method_References_05;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;


public class Instance_Method_Reference {

    public void great(String name){
        System.out.println("My name is " + name);
    }

    public int addition(int a,int b){
        return a+b;
    }

    public int square(int a){
        return a*a;
    }
    public static void main(String[] args) {
        Instance_Method_Reference imr = new Instance_Method_Reference();

        //without Using instance_Method_Reference
        Consumer<String> wish = name->imr.great("LC_13_RomanToInteger");
        wish.accept("LC_13_RomanToInteger "); // My name is LC_13_RomanToInteger

        //with instance_Method_Reference
        Consumer<String> wish1 = imr::great;
        wish1.accept("Laveti");  // My name is Laveti


        BiFunction<Integer,Integer,Integer> addition = (a,b) ->a+b;
        System.out.println(addition.apply(2,4));

        BiFunction<Integer,Integer,Integer> addition1 = imr::addition;
        System.out.println(addition1.apply(2,4));

        Function<Integer,Integer> square = imr::square;
        System.out.println(square.apply(2)); //2
    }
}
