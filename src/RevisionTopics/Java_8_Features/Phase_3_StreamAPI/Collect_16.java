package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collect_16 {
    public static void main(String[] args) {
        // 1. collect(Collectors.toList())
        List<String> nums = Arrays.asList("Saikumar", "Santosh", "Naresh", "Naveen");
        List<String> upperCase = nums.stream().map(String::toUpperCase).toList();
        upperCase.stream().forEach(System.out::println);


        //2.collecct(Collects.toSet())
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        Set<Integer> unique = num.stream().collect(Collectors.toSet());
        System.out.println(unique);

        //3. collect(Collectors.joining())
        List<String> name = Arrays.asList("Saikumar", "Santosh", "Test", "Demo");
        String result = name.stream().collect(Collectors.joining(","));
        System.out.println(result);  // Saikumar,Santosh,Test,Demo

        //4.counting
        List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        Long count = num2.stream().collect(Collectors.counting());
        System.out.println(count);

        //    5.collect(Collectors.groupingBy())
        //    6. collect(Collectors.partitioningBy())
        //    7. collect(Collectors.toMap())

    }
    }
