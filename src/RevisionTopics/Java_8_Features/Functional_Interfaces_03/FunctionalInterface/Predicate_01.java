package RevisionTopics.Java_8_Features.Functional_Interfaces_03.FunctionalInterface;

import java.util.function.Predicate;

class Predicate_01 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n)->n%2==0;
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));

        Predicate<String> name = (n)->n.startsWith("s");
        System.out.println(name.test("saikumar")); // true
        System.out.println(name.test("kumar")); //false

        //and

        Predicate<Integer> LessThanAge = age-> age < 30;
        Predicate<Integer> GreaterThanAge = age-> age > 20;

        Predicate<Integer> result = LessThanAge.and(GreaterThanAge);
        System.out.println(result.test(20)); //false
        System.out.println(result.test(28)); //true

        //or

        Predicate<Integer> isOdd  = num -> num%2==1;
        Predicate<Integer> greater = num -> num > 100;

        Predicate<Integer> checkNum = isOdd.or(greater);
        System.out.println(checkNum.test(2)); //false
        System.out.println(checkNum.test(3)); //true

        // negate()
        Predicate<Integer> isEvenNum = n -> n % 2 == 0;
        Predicate<Integer> isOddNum = isEvenNum.negate();
        System.out.println(isOddNum.test(7)); //true
        System.out.println(isOddNum.test(2)); //false

    }
}
