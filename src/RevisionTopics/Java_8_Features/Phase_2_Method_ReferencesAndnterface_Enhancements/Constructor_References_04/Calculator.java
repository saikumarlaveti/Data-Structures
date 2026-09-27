package RevisionTopics.Java_8_Features.Phase_2_Method_ReferencesAndnterface_Enhancements.Constructor_References_04;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Calculator {
    public Calculator() {
        System.out.println("This is Calculator Constructor");
    }

    public Calculator(String name){
        System.out.println("Hi Good Morning " + name);
    }

    public static void main(String[] args) {
        //using lambda function
        Supplier<Calculator> l1 = ()-> new Calculator();
        l1.get();

        Function<String , Calculator> l2 = (String name) ->new Calculator(name);
        l2.apply("Saikumar lambda function");
//Constructor reference
        // 0 - parameter constructor
        Supplier<Calculator> c = Calculator::new;
        c.get();

        // parameter constructor
        Function<String,Calculator> c1 = Calculator::new;
        c1.apply("Saikumar");
    }
}
