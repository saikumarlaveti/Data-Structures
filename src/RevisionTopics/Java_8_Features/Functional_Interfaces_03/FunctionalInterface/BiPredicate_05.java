package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicate_05 {
    public static void main(String[] args) {

        //1.test()
        BiPredicate<Integer,Integer> result = (a,b) -> a>b;
        System.out.println(result.test(4, 5)); //false
        System.out.println(result.test(5, 4)); //true

        BiPredicate<String,String> equals = (a,b) -> a.equals(b);
        System.out.println(equals.test("Saikumar","Saikumar")); //true
        System.out.println(equals.test("sai","kumar"));//false

        //2.and()
        BiPredicate<Integer,String> check1 = (a,b) -> a>18 && b.startsWith("Saikumar");
        BiPredicate<Integer,String> check2 = (c,d) -> c<25 && d.endsWith("Laveti");

        BiPredicate<Integer,String> result3 = check1.and(check2);

        System.out.println(result3.test(20, "Saikumar Laveti")); //true
        System.out.println(result3.test(26, "Santosh Laveti"));  //false


        //3.or()
        BiPredicate<Integer, Integer> p1 = (a, b) -> a > b;

        BiPredicate<Integer, Integer> p2 =(a, b) -> a == b;

        BiPredicate<Integer, Integer> results = p1.or(p2);

        System.out.println(results.test(5, 5)); //true
        System.out.println(results.test(3, 4));  //false


        //4.negate()

        BiPredicate<Integer,Integer> p3 = (a,b) -> a>b;

        BiPredicate<Integer,Integer> p4 = p3.negate();
        System.out.println(p3.test(10, 5)); //true
        System.out.println(p4.test(10, 5)); //false

    }
}

