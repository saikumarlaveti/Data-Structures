import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

class Empty{
    public static void main(String[] args) {
        Predicate<String> result = (name)-> name.startsWith("s");
        System.out.println(result.test("aikumar"));

        BiPredicate<Integer,String> result1 = (number,name)->number%2==0 || name.startsWith("s");
        System.out.println(result1.test(3,"saikumar"));

        Function<Integer,Integer> function1 = (input)->input*2;
        System.out.println(function1.apply(2));
        BiFunction<Integer,Integer,Integer> BiFunction1 = (input1,input2)->input1*input2;
        System.out.println(BiFunction1.apply(2,3));
    }
}