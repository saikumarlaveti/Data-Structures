package RevisionTopics.Java_8_Features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
class sai{
    String name = "Saikumar";
}
public class SupplierInterface {

    public static void main(String[] args) {
        Supplier<Date> ref = ( ) -> new Date( );
        System.out.println(ref.get());

        Predicate<Integer> p1 = i -> i%2 == 0;
        Function<Integer,Integer> p2 = i -> i%2;
        Consumer<Integer> p3 = i-> System.out.println("Given number is "+ i);
        Supplier<sai> p4 = ( )-> new sai( );
        System.out.println(p4.get().name);
        System.out.println(p1.test(2));
        System.out.println(p2.apply(2));
        p3.accept(2);
        }
}
