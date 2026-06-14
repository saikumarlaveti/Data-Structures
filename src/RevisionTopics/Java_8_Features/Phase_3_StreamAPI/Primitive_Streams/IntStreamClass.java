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





    }
}
