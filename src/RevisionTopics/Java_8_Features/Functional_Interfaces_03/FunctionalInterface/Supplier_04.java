package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

import java.time.LocalDate;
import java.util.function.Supplier;

    public class Supplier_04 {
        public static void main(String[] args) {

            Supplier<String> name = () -> "LC_13_RomanToInteger Laveti";
            System.out.println(name.get());

            Supplier<Integer> num = () ->(int)(Math.random()*100);
            System.out.println(num.get());

            Supplier<LocalDate> date = ()->LocalDate.now();
            System.out.println(date.get());
        }
    }


