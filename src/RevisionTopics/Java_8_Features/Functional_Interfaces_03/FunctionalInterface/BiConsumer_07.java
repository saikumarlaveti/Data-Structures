package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumer_07 {
    public static void main(String[] args) {
        //1.accept()
        BiConsumer<String,String> greeting = (a,b) -> System.out.println(" my name is " + a + " i am from " + b);

        greeting.accept("LC_13_RomanToInteger","Guravam");  //my name is LC_13_RomanToInteger i am from Guravam

        //2.andThen()
        BiConsumer<String,String> info = (a,b) -> System.out.println(" my name is " + a + " i am from " + b);
        BiConsumer<String,String> wish = (a,b) -> System.out.println("i am studing " + a + " age : " + b);

        BiConsumer<String,String> data = info.andThen(wish);
        info.andThen(wish).accept("LC_13_RomanToInteger","Rajam");

   //     my name is LC_13_RomanToInteger i am from Rajam
//        i am studying LC_13_RomanToInteger age : Rajam



    }
}
