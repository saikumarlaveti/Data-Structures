package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Primitive_Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamClass {
    public static void main(String[] args) {
        //1.Integer stream - non primitive type
        System.out.println("Integer Stream");
        Stream<Integer> nums = Stream.of(1,2,3,4,5);
        nums.forEach(System.out::println);

        //2.int Stream  - primitive stream
        System.out.println("InStream.of()");
        IntStream numbers = IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);

        System.out.println("Instream.range()");
        IntStream no = IntStream.range(1,11);
        no.forEach(System.out::println);

        System.out.println("Instream.closed()");
        IntStream no1 = IntStream.rangeClosed(1,10);
        no1.forEach(System.out::println);

        System.out.println("Intstream.iterate()");
        IntStream no2 = IntStream.iterate(0,n->n+2).limit(5);
        no2.forEach(System.out::println);

        System.out.println("Intstream.generate()");
        IntStream no3 = IntStream.generate(()->(int)(Math.random()*100)).limit(5);
        no3.forEach(System.out::println);

        System.out.println("Intstream.fromArray()");
        int[] arr = {1,2,3,4,5};
        IntStream no4 = Arrays.stream(arr);
        no4.forEach(System.out::println);

        System.out.println("Intstream.count()");
        int[] arr1 = {1,2,3,4,5};
        IntStream no5 = Arrays.stream(arr1);
       long rs =  no5.count();
        System.out.println(rs);

        System.out.println("Q1. Generate numbers from 1 to 20 using IntStream.rangeClosed().");
        IntStream numbers1 = IntStream.rangeClosed(1,20);
        numbers1.forEach(System.out::println);

        System.out.println("Q2. Generate numbers from 1 to 50 and print only multiples of 5.");
        IntStream numbers2 = IntStream.rangeClosed(1,50);
        numbers2.filter(n->n%5==0).forEach(System.out::println);

        System.out.println("Q3. Calculate the sum of numbers from 1 to 100.");
        int sum = IntStream.rangeClosed(1,100).sum();
        System.out.println(sum);

        System.out.println("Q4. Find the average of numbers from 1 to 10.");
        double result4 = IntStream.rangeClosed(1,10).average().orElse(0.0);
        System.out.println(result4);

        System.out.println("Q5. Find the maximum value.");
        int[] numbers = {45, 90, 25, 100, 60, 80};
        OptionalInt result5 = IntStream.of(numbers).max();
        System.out.println(result5);

        System.out.println("Q6. Find all even numbers from 1 to 30 and calculate their sum.");
        int result6 = IntStream.rangeClosed(1,30).filter(n->n%2==0).sum();
        System.out.println(result6);

        System.out.println("Q7. Generate numbers from 1 to 10, square each number, and collect the results into a List<Integer>.");
        List<Integer> result7 = IntStream.rangeClosed(1,10).map(n->n*n).boxed().collect(Collectors.toList());

        System.out.println("Q8. Find distinct numbers and sort them in ascending order.");
        int[] numbers8 = {50, 20, 10, 50, 30, 20, 40};
        List<Integer> result8 = Arrays.stream(numbers8).distinct().boxed().sorted().collect(Collectors.toList());
        System.out.println(result8);

        System.out.println("Q9. Find the second-highest distinct number.");
        int[] numbers9 = {10, 50, 20, 80, 50, 30};
        int result9 = IntStream.of(numbers9).boxed().sorted(Comparator.reverseOrder()).skip(1).mapToInt(Integer::intValue).findFirst().orElse(0);
        System.out.println(result9);


        System.out.println("Q10. Find the first even number from 1 to 100 that is divisible by 12.");
        long result10 = IntStream.rangeClosed(1,100).filter(n->n%2==0).filter(m->m%12==0).findFirst().orElse(0);
        System.out.println(result10);

        System.out.println("Q11. Find all prime numbers between 1 and 100.");





    }
}
