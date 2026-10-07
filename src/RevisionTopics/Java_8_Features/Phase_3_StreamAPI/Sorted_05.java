package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_05 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,1,8,4,1);
        list.stream().sorted().forEach(System.out::println);

        List<String> names = Arrays.asList("saikumar","abhi","naveen");
        List<String>sortResult = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortResult);  //[abhi, naveen, saikumar]

        System.out.println("1. Sort numbers in ascending order");
        List<Integer> numbers = Arrays.asList(50, 10, 40, 20, 30);
        numbers.stream().sorted().forEach(System.out::println);
        List<Integer> result1 = numbers.stream().sorted().toList();
        System.out.println(result1);

        System.out.println("2. Sort numbers in descending order");
        List<Integer> numbers2 = Arrays.asList(50, 10, 40, 20, 30);
        numbers2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("3. Sort names alphabetically");
        List<String> names3 = Arrays.asList(
                "Ravi",
                "Sai",
                "John",
                "Anil",
                "Kumar"
        );

        names3.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        System.out.println("4. Sort names in reverse alphabetical order");
        List<String> names4 = Arrays.asList(
                "Ravi",
                "Sai",
                "John",
                "Anil",
                "Kumar"
        );

        names4.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        System.out.println("5. Print numbers greater than 25 in ascending order");
        List<Integer> numbers5 = Arrays.asList(
                10, 50, 20, 40, 30, 15, 60
        );

        numbers5.stream().sorted().filter(n->n>25).forEach(System.out::println);

        System.out.println("6. Print even numbers in ascending order");
        List<Integer> numbers6 = Arrays.asList(
                35, 10, 42, 15, 20, 55, 30
        );

        numbers6.stream().filter(n->n%2==0).forEach(System.out::println);

        System.out.println("7. Print odd numbers in descending order");
        List<Integer> numbers7 = Arrays.asList(
                35, 10, 42, 15, 20, 55, 30
        );
        numbers7.stream().filter(n->n%2==1).forEach(System.out::println);

        System.out.println("8. Print salaries greater than ₹40,000 in descending order");
        List<Integer> salaries = Arrays.asList(
                30000, 60000, 45000, 75000, 35000, 50000
        );

        salaries.stream().sorted(Comparator.reverseOrder()).filter(n->n>40000).forEach(System.out::println);


    }
}
