package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Primitive_Streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Basic_Operations {
    public static void main(String[] args) {

        //sum()
        IntStream no1 = IntStream.of(1,2,3,4,5);
        int count = no1.sum();
        System.out.println("count " + count);
        //min()
        IntStream no2 = IntStream.of(1,2,3,4,5);
        OptionalInt min = no2.min();
        System.out.println(min.getAsInt());

        //max
        IntStream no3 = IntStream.of(1,2,3,4,5);
        OptionalInt max = no3.max();
        System.out.println(max.getAsInt());

        //average
        IntStream no4 = IntStream.of(1,2,3,4,5);
        OptionalDouble average = no4.average();
        System.out.println(average.getAsDouble());

        //summaryStatistics() — All stats at once
        IntSummaryStatistics stats = IntStream.rangeClosed(1,10).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());

        int[] array = {1,2,3,4,5};


    }
}
