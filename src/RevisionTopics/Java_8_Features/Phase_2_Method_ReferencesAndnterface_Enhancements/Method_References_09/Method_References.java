package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.Method_References_09;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Method_References {
    public static int square(int a){
        return a*a;
    }
    public static int add(int a,int b){
        return a+b;
    }

    public static void display(String name){
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        Function<Integer,Integer> square = Method_References::square;
        System.out.println(square.apply(2));

        BiFunction<Integer,Integer,Integer> addition = Method_References::add;
        System.out.println(addition.apply(2,3));

        Consumer<String> print = Method_References::display;
        print.accept("Saikumar Laveti");
    }

}



