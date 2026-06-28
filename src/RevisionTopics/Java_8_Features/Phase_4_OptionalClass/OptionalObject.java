package RevisionTopics.Java_8_Features.Phase_4_OptionalClass;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalObject {
    public static void main(String[] args) {
         Optional<Object> result = Optional.empty();
        System.out.println(result.isPresent());  //false
        System.out.println(result);  //Optional.empty

        String name = "LC_13_RomanToInteger";
        Optional<Object> test = Optional.of(name);
        System.out.println(test);  //Optional[LC_13_RomanToInteger]

        String test1 = "LC_13_RomanToInteger";
        String test2 = null;
        Optional<String> test3 = Optional.ofNullable(test1);
        Optional<String> test4 = Optional.ofNullable(test2);
        System.out.println(test3);   // Optional[LC_13_RomanToInteger]
        System.out.println(test4);   // Optional.empty


        //Common Methods
     //2.1 — isPresent()
        Optional<String> test5 = Optional.of("LC_13_RomanToInteger");
        Optional<String> test6 = Optional.empty();
        System.out.println(test5.isPresent());  // true
        System.out.println(test6.isPresent()); // false

        //  2.2 — ifPresent()

        Optional<String> test7 = Optional.of("LC_13_RomanToInteger");
        Optional<String> test8 = Optional.empty();
        test7.ifPresent(n-> System.out.println("Welcome to the java 8 features " + test7));
        // Welcome to the java 8 features Optional[LC_13_RomanToInteger]
        test8.ifPresent(n-> System.out.println("Welcome to the java 8 features " + test8));  // Nothing print
         //2.3 — get()
        Optional<String> test9 = Optional.of("LC_13_RomanToInteger Laveti");
        System.out.println(test9.get());   //LC_13_RomanToInteger Laveti
        Optional<String> test10 = Optional.of("");
        System.out.println(test10.get());

        //2.4 — orElse()
        Optional<String> test11 = Optional.of("LC_13_RomanToInteger");
        String test12 = test11.orElse("Santosh Kumar");
        System.out.println(test12);  //LC_13_RomanToInteger

        Optional<String> test13 = Optional.ofNullable(null);
        String test14 = test13.orElse("Santosh Kumar");
        System.out.println(test14); //Santosh Kumar

        //2.5 — orElseGet()
        Optional<String> test15 = Optional.ofNullable("LC_13_RomanToInteger 123");
        String result1 = test15.orElseGet(()->{
            System.out.println("Name is available");
            return "Common name";
        });
        System.out.println(result1);
        Optional<String> test16 = Optional.ofNullable(null);
        String result2 = test16.orElseGet(()->{
            System.out.println("it is not null");
            return "it is null";
        });
        System.out.println(result2);


        //2.6 — orElseThrow()
        Optional<String> test17  = Optional.ofNullable(null);
       String test18 =  test17.orElseThrow(()->new IllegalArgumentException("name not found"));
        System.out.println(test18);   // Throws: IllegalArgumentException: Name not found
        //2.7 — filter()
        //2.8 — map()
        //2.9 — flatMap()








    }
}
