package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collect_16 {
    public static void main(String[] args) {
        /*Java 8 Stream API — collect()
You've completed reduce(). Now we'll learn collect(), another important terminal operation in Java 8 Streams.

We'll learn it step by step, with examples and 10 coding exercises for Eclipse.
1. What is collect()?
The collect() method is used to gather the elements of a stream into a result, such as a List, Set, Map, or String.

For example, suppose you have an array:
int[] numbers = {10, 15, 20, 25, 30};


You want to collect only the even numbers into a List.
INPUT ARRAY
10

15

20

25

30


filter(n -> n % 2 == 0)

10

20

30


collect(Collectors.toList())

[10, 20, 30]
Final List<Integer>

2. Syntax
stream.collect(Collectors.toList());


Here:
- stream — your stream of elements.
- collect() — terminal operation that gathers the result.
- Collectors.toList() — collector that gathers elements into a List.
Import these classes:
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


3. Example 1 — Collect even numbers into a List
int[] numbers = {10, 15, 20, 25, 30};

List<Integer> evenNumbers = Arrays.stream(numbers)
    .filter(n -> n % 2 == 0)
    .boxed()
    .collect(Collectors.toList());

System.out.println(evenNumbers);


Output:
[10, 20, 30]


Important: Arrays.stream(int[]) creates an IntStream. The .boxed() method converts primitive int values into Integer objects so they can be collected into List<Integer>.
4. Example 2 — Collect names starting with S
List<String> names = Arrays.asList(
    "Sai", "Ravi", "Santosh", "Kumar", "Suresh"
);

List<String> result = names.stream()
    .filter(n -> n.startsWith("S"))
    .collect(Collectors.toList());

System.out.println(result);


Output:
[Sai, Santosh, Suresh]


Notice that we don't need .boxed() here because List<String> already contains objects.
5. Example 3 — Convert names to uppercase
List<String> names = Arrays.asList("java", "spring", "mysql");

List<String> result = names.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());

System.out.println(result);


Output:
[JAVA, SPRING, MYSQL]


Here, map() transforms the elements and collect() gathers them into a new list.
6. Example 4 — Remove duplicates using toSet()
List<Integer> numbers = Arrays.asList(
    10, 20, 10, 30, 20, 40
);

Set<Integer> result = numbers.stream()
    .collect(Collectors.toSet());

System.out.println(result);


The resulting set contains {10, 20, 30, 40}, although the printing order is not guaranteed.

You'll need to import java.util.Set.
7. Example 5 — Combine names using joining()
List<String> names = Arrays.asList("Sai", "Ravi", "Kumar");

String result = names.stream()
    .collect(Collectors.joining(", "));

System.out.println(result);


Output:
Sai, Ravi, Kumar


This is useful for creating comma-separated strings.
8. reduce() vs collect()
reduce()	collect()
Combines values into a result	Accumulates elements into a result container or summary
Sum, product, maximum	List, Set, Map, joining
Commonly uses an identity and accumulator	Commonly uses a Collector
Example: reduce(0, Integer::sum)	Example: collect(Collectors.toList())

Both are terminal operations.
        */
        // 1. collect(Collectors.toList())
        List<String> nums = Arrays.asList("LC_13_RomanToInteger", "Santosh", "Naresh", "Naveen");
        List<String> upperCase = nums.stream().map(String::toUpperCase).toList();
        upperCase.stream().forEach(System.out::println);


        //2.collecct(Collects.toSet())
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        Set<Integer> unique = num.stream().collect(Collectors.toSet());
        System.out.println(unique);

        //3. collect(Collectors.joining())
        List<String> name = Arrays.asList("LC_13_RomanToInteger", "Santosh", "Test", "Demo");
        String result = name.stream().collect(Collectors.joining(","));
        System.out.println(result);  // LC_13_RomanToInteger,Santosh,Test,Demo

        //4.counting
        List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        Long count = num2.stream().collect(Collectors.counting());
        System.out.println(count);

        //    5.collect(Collectors.groupingBy())
        //    6. collect(Collectors.partitioningBy())
        //    7. collect(Collectors.toMap())

        System.out.println("1.Collect even numbers into a List");
        int[] arr1 = {10, 15, 20, 25, 30, 35};

        List<Integer> nums = Arrays.stream(arr1).
                filter(n->n%2==0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(nums);

        System.out.println("2.Collect odd numbers");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> nums2 = Arrays.stream(arr2).filter(n->n%2==1).boxed().collect(Collectors.toList());
        System.out.println(nums2);

        System.out.println("3.Collect names starting with A");
        List<String> names3 = Arrays.asList(
                "Amit", "Ravi", "Anil", "Kumar", "Arjun"
        );
        List<String> arr3 = names3.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
        System.out.println(arr3);

        System.out.println("4.Convert names to uppercase");
        List<String> names4 = Arrays.asList(
                "java", "spring", "mysql", "docker"
        );
        List<String> arr4 = names4.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(arr4);

        System.out.println("5.Collect numbers greater than 20");
        int[] arr5 = {10, 25, 15, 40, 30, 5};
        List<Integer> num5 = Arrays.stream(arr5).filter(n->n>20).boxed().collect(Collectors.toList());
        System.out.println(num5);

        System.out.println("6.Collect squares of numbers");
        int[] arr6 = {2, 3, 4, 5};
        List<Integer> num6 = Arrays.stream(arr6).map(n->n*n).boxed().collect(Collectors.toList());
        System.out.println(num6);

        System.out.println("7.Collect unique numbers");
        List<Integer> numbers7 = Arrays.asList(
                10, 20, 10, 30, 20, 40
        );
        List<Integer> num7 = numbers7.stream().distinct().toList();
        System.out.println(num7);

        System.out.println("8.Collect names longer than 4 characters");
        List<String> names8 = Arrays.asList(
                "Sai", "Ramesh", "John", "Alexander", "Kumar"
        );

        List<String> arr8 = names8.stream().filter(a->a.length()>4).collect(Collectors.toList());
        System.out.println(arr8);

        System.out.println("9.Collect numbers in descending order");
        List<Integer> numbers9 = Arrays.asList(
                40, 10, 30, 20, 50
        );
        List<Integer> arr9 = numbers9.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(arr9);

        System.out.println("10.Combine multiple stream operations");
        List<Integer> numbers10 = Arrays.asList(
                10, 15, 20, 25, 30, 35, 40, 20, 30
        );

        List<Integer> num10 = numbers10.stream().filter(n->n%2==0).distinct().map(m->m*2).sorted().collect(Collectors.toList());
        System.out.println(num10);


    }
    }
