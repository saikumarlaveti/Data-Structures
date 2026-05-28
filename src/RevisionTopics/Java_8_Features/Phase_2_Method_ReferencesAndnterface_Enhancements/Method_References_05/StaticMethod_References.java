package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.Method_References_05;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class StaticMethod_References {
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
        Function<Integer,Integer> square = StaticMethod_References::square;
        System.out.println(square.apply(2));  //4

        BiFunction<Integer,Integer,Integer> addition = StaticMethod_References::add;
        System.out.println(addition.apply(2,3)); // 5

        Consumer<String> print = StaticMethod_References::display;
        print.accept("Saikumar Laveti"); //My name is Saikumar Laveti
    }

}



