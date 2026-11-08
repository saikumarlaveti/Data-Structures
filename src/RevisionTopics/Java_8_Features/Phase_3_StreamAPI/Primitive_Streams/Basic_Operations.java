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

         System.out.println("Create an IntStream containing:");
        IntStream numbers1 = IntStream.of(10,20,30,40,50);
        numbers1.forEach(System.out::println);

        System.out.println("Generate numbers from 1 to 10 using IntStream.range().");
        IntStream numbers2 = IntStream.range(1,10);
        numbers2.forEach(System.out::println);

        System.out.println("Generate numbers from 1 to 10 using IntStream.rangeClosed().");

        IntStream numbers3 = IntStream.rangeClosed(1,10);
        numbers3.forEach(System.out::println);

        System.out.println("Q4. Calculate sum");
        int[] numbers4 = {10, 20, 30, 40, 50};
        int result4 = IntStream.of(numbers4).sum();
        System.out.println(result4);

        System.out.println("Q5. Calculate average");
        int[] numbers5 = {10, 20, 30, 40, 50};
        Double result5 = IntStream.of(numbers5).average().orElse(0.0);
        System.out.println(result5);

        System.out.println("Q6. Find minimum and maximum");
        int[] numbers6 = {45, 10, 80, 25, 60};
        IntSummaryStatistics result6 = IntStream.of(numbers6).summaryStatistics();
        System.out.println("Minimum " + result6.getMin());
        System.out.println("Maximum " + result6.getMax());

        System.out.println("Q7. Convert Stream<Integer> into IntStream");
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        int result7 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result7);

        System.out.println("Q8. Convert IntStream into List<Integer>");
        List<Integer>result8 = IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList());
        System.out.println(result8);

        System.out.println("Q9. Convert numbers into strings using mapToObj()");
        List<String> result9 = IntStream.rangeClosed(1,5).mapToObj(n->"Java"+n).collect(Collectors.toList());
        System.out.println(result9);

        System.out.println("Q10. Calculate complete statistics");
        int[] numbers10 = {10, 20, 30, 40, 50, 60};

        IntSummaryStatistics result10 = Arrays.stream(numbers10).summaryStatistics();
        System.out.println("Count : "+result10.getCount());
        System.out.println("Sum : " + result10.getSum());
        System.out.println("Minimum : " + result10.getMin());
        System.out.println("Maximum : "+ result10.getMax());
        System.out.println("Average : "+ result10.getAverage());



    }
}
