package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Primitive_Streams;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Converting_IntStream_to_OtherTypes {
    public static void main(String[] args) {
       // 1.boxed() — IntStream to Stream<Integer>
        List<Integer> list1 = IntStream.rangeClosed(1,5).boxed().toList();
        System.out.println(list1);   // [1, 2, 3, 4, 5]

        // 2.mapToObj() — IntStream to Stream<Object>
        List<String> list2 = IntStream.rangeClosed(1,5).mapToObj(n->"Number:" + n).collect(Collectors.toList());
        System.out.println(list2); // [Number:1, Number:2, Number:3, Number:4, Number:5]

        // 3.mapToLong() — IntStream to LongStream
        LongStream longStream = IntStream.rangeClosed(1,5).mapToLong(n->(long)n);
        longStream.forEach(System.out::println);  // 1 2 3 4 5

       // 4.mapToDouble() — IntStream to DoubleStream
        DoubleStream doubleStream = IntStream.rangeClosed(1,5).mapToDouble(n->(double) n);
        doubleStream.forEach(System.out::println);  // 1.0  2.0  3.0  4.0  5.0


    }
}
