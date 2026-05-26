package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperator_08 {
    public static void main(String[] args) {
        UnaryOperator<Integer> Square = (a) -> a*a;
        UnaryOperator<Integer> increment = n->n+5;
        UnaryOperator<String> name = (n) -> n.toUpperCase();


        //1.apply ()
        System.out.println(Square.apply(2)); //4
        System.out.println(increment.apply(5)); // 10
        System.out.println(name.apply("saikumar")); //SAIKUMAR

        //2.andThen()
        UnaryOperator<Integer> addition = a->  a+10;
        UnaryOperator<Integer> multiplication = m -> m*10;

        int result = addition.andThen(multiplication).apply(2);
        System.out.println(result);  //120

        //3.compose()

        UnaryOperator<Integer> addition_1 = a->  a+10;
        UnaryOperator<Integer> multiplication_1 = m -> m*10;

        int result_1 = addition.compose(multiplication).apply(2);
        System.out.println(result_1);  //30


        //4.identity( )

        UnaryOperator<String> print = UnaryOperator.identity();
        System.out.println(print.apply("Saikumar Laveti"));  // Saikumar Laveti

        UnaryOperator<List<String>> listOfStudents = UnaryOperator.identity();


    }
}
