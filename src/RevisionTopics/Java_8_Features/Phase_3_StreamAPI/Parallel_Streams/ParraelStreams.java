package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Parallel_Streams;

import java.util.Arrays;
import java.util.List;

public class ParraelStreams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Using Sequenial Stream");
        nums.stream().forEach(System.out::println);
        System.out.println("Using Parallel Stream");
        nums.parallelStream().forEach(System.out::println);

         System.out.println("Q1. Print numbers using Parallel Stream");
        List<Integer> numbers1 = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );
        numbers1.parallelStream().forEach(n-> {System.out.println(n + " - " + Thread.currentThread().getName());});

        System.out.println("Q2. Print numbers in order");
        List<Integer> numbers2 = Arrays.asList(
                10, 20, 30, 40, 50
        );
        numbers2.parallelStream().forEachOrdered(System.out::println);

        System.out.println("Q3. Filter even numbers using Parallel Stream");
        List<Integer> numbers3 = Arrays.asList(
                10, 15, 20, 25, 30, 35, 40
        );
        List<Integer>result3= numbers3.parallelStream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(result3);

        System.out.println("Q4. Multiply numbers by 2");
        List<Integer> numbers4 = Arrays.asList(
                5, 10, 15, 20
        );

        List<Integer> result4 = numbers4.parallelStream().map(n->n*2).collect(Collectors.toList());
        System.out.println(result4);

        System.out.println("Q5. Calculate sum using Parallel Stream");
        List<Integer> numbers5 = Arrays.asList(
                10, 20, 30, 40, 50
        );
        int result5 = numbers5.parallelStream().reduce(0,(a,b)->a + b);
        System.out.println(result5);


        System.out.println("Q6. Filter names starting with S");
        List<String> names6 = Arrays.asList(
                "Sai", "Ravi", "Santosh", "Kumar", "Suresh"
        );
        List<String>result6 = names6.parallelStream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result6);

        System.out.println("Q7. Find maximum using Parallel Stream");
        List<Integer> numbers7 = Arrays.asList(
                10, 50, 20, 80, 30
        );
        numbers7.parallelStream().max(Integer::compareTo).ifPresent(System.out::println);

        System.out.println("Q8. Count numbers greater than 20");
        List<Integer> numbers8 = Arrays.asList(
                10, 25, 15, 40, 30, 5
        );

        Long result8 = numbers8.parallelStream().filter(n->n>20).count();
        System.out.println(result8);

        System.out.println("Q9. Convert names to uppercase");
        List<String> names9 = Arrays.asList(
                "sai", "ravi", "kumar", "john"
        );
        List<String> result9 = names9.parallelStream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result9);

        System.out.println("Q10. Combine filter, map and reduce");
        List<Integer> numbers10 = Arrays.asList(
                5, 10, 15, 20, 25, 30
        );
        int result10 = numbers10.parallelStream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .reduce(0, (a, b) -> a + b);

        System.out.println(result10);

        System.out.println("Q11. Find the minimum number using parallelStream().");
        List<Integer> numbers = Arrays.asList(40, 10, 50, 20, 30);

        int result11 = numbers.parallelStream().min(Integer::compareTo).orElse(0);

        System.out.println("Q12. Calculate the sum of squares of even numbers.");
        List<Integer> numbers12 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result12 = numbers12.parallelStream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(result12);

        System.out.println("Q13. Find the number of unique names using a parallel");
        List<String> names = Arrays.asList(
                "Sai", "Ravi", "Sai", "Kumar", "Ravi"
        );
        List<String>result13 = names.parallelStream().distinct().collect(Collectors.toList());
        System.out.println(result13);

    }
}
