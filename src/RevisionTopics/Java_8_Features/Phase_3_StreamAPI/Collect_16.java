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
reduce()    collect()
Combines values into a result   Accumulates elements into a result container or summary
Sum, product, maximum   List, Set, Map, joining
Commonly uses an identity and accumulator   Commonly uses a Collector
Example: reduce(0, Integer::sum)    Example: collect(Collectors.toList())

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

        List<Integer> evenNums = Arrays.stream(arr1).
                filter(n->n%2==0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(evenNums);

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

        System.out.println("11.Collect unique names");
        List<String> names11 = Arrays.asList(
                "Sai", "Ravi", "Sai", "Kumar", "Ravi"
        );
        Set<String> result11 = names11.stream().collect(Collectors.toSet());
        System.out.println(result11);

        System.out.println("12.Collect unique even numbers");
        int[] arr12 = {10, 15, 20, 10, 30, 20, 35};
        Set<Integer> result12 = Arrays.stream(arr12).filter(n->n%2==0).boxed().collect(Collectors.toSet());
        System.out.println(result12);

        System.out.println("Q13. Collect unique uppercase names");
        List<String> names13 = Arrays.asList(
                "java", "spring", "java", "mysql", "spring"
        );
        Set<String> result13 = names13.stream().map(String::toUpperCase).collect(Collectors.toSet());
        System.out.println(result13);

        System.out.println("Q14. Collect unique squares");
        int[] arr14 = {2, 3, 2, 4, 3, 5};
        Set<Integer> result14 = Arrays.stream(arr14).map(n->n*n).boxed().collect(Collectors.toSet());
        System.out.println(result14);

        System.out.println("Q15. Collect unique names longer than 4 characters");
        List<String> names15 = Arrays.asList(
                "Sai", "Ramesh", "Kumar", "Ramesh",
                "John", "Alexander", "Kumar"
        );

        Set<String> result15 = names15.stream().distinct().filter(n->n.length()>4).collect(Collectors.toSet());
        System.out.println(result15);

        System.out.println("Q16. Join names without separator");
        List<String> names16 = Arrays.asList("Sai", "Ravi", "Kumar");
        String result16  = names16.stream().collect(Collectors.joining());
        System.out.println(result16);

        System.out.println("Q17. Join programming languages with commas");
        List<String> languages17 = Arrays.asList("Java", "Python", "SQL", "JavaScript");
        String result17 =  languages17.stream().collect(Collectors.joining(","));
        System.out.println(result17);

        System.out.println("Q18. Join names with a hyphen");
        List<String> names18 = Arrays.asList("Ravi", "Kumar", "Sai");
        String result18 = names18.stream().collect(Collectors.joining("-"));
        System.out.println(result18);

        System.out.println("Q19. Join with prefix and suffix");
        List<String> fruits19 = Arrays.asList("Apple", "Banana", "Mango");
        String result19 = fruits19.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(result19);

        System.out.println("Q20. Convert names to uppercase and join");
        List<String> names20 = Arrays.asList("java", "spring", "mysql");
        String result20 = names20.stream().map(String::toUpperCase).collect(Collectors.joining("|"));
        System.out.println(result20);

        System.out.println("Q21. Filter names starting with S and join");
        List<String> names21 = Arrays.asList(
                "Sai", "Ravi", "Santosh", "Kumar", "Suresh"
        );
        String result21 = names21.stream().filter(s->s.startsWith("S")).collect(Collectors.joining(","));
        System.out.println(result21);

        System.out.println("Q22. Join numbers with a comma");
        List<Integer> numbers22 = Arrays.asList(10, 20, 30, 40);
        String result22 = numbers22.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(result22);

        System.out.println("Q23. Join unique names");
        List<String> names23 = Arrays.asList(
                "Sai", "Ravi", "Sai", "Kumar", "Ravi"
        );
        String result23 = names23.stream().distinct().collect(Collectors.joining("-"));
        System.out.println(result23);

        System.out.println("Q24. Sort names and join");
        List<String> names24 = Arrays.asList(
                "Kumar", "Sai", "Anil", "Ravi"
        );
        String result24 = names24.stream().sorted().collect(Collectors.joining(","));
        System.out.println(result24);

        System.out.println("Q25. Combine multiple operations");
        List<String> names25 = Arrays.asList(
                "java", "python", "java", "spring",
                "mysql", "spring", "docker"
        );
        String result25 = names25.stream().distinct().filter(n->n.length()>4).map(String::toUpperCase).sorted().collect(Collectors.joining(" - "));
        System.out.println(result25);

        System.out.println("Q1. Group names by length");
        List<String> names1 = Arrays.asList(
                "Sai", "Ravi", "John", "Kumar", "Anil"
        );
        Map<Integer,List<String>> result1 = names1.stream().collect(Collectors.groupingBy(n->n.length()));
        System.out.println(result1);

        System.out.println("Q2. Group numbers into even and odd");
        List<Integer> numbers2 = Arrays.asList(
                10, 15, 20, 25, 30, 35
        );
        Map<String,List<Integer>> result2 = numbers2.stream().collect(Collectors.groupingBy(n->n%2==0?"Even":"Odd"));
        System.out.println(result2);

        System.out.println("Q3. Group names by first character");
        List<String> groupNames3 = Arrays.asList(
                "Sai", "Santosh", "Ravi", "Ramesh", "Kumar"
        );
        Map<Character,List<String>> result3 = groupNames3.stream().collect(Collectors.groupingBy(s->s.charAt(0)));
        System.out.println(result3);

        System.out.println("Q4. Count frequency of each word");
        List<String> words4 = Arrays.asList(
                "Java", "Python", "Java", "SQL", "Python", "Java"
        );
        Map<String,Long> result4 = words4.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(result4);

        System.out.println("Q5. Group numbers greater than 20");
        List<Integer> numbers5 = Arrays.asList(
                10, 25, 15, 40, 30, 5
        );
        Map<String,List<Integer>> result5 = numbers5.stream().collect(Collectors.groupingBy(n->n>20?"Greater":"SmallerOrEqual"));
        System.out.println(result5);

        System.out.println("Q6. Group names by first character and count");
        List<String> names6 = Arrays.asList(
                "Sai", "Santosh", "Ravi", "Ramesh", "Kumar", "Suresh"
        );
        Map<Character,Long> result6 = names6.stream().collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting()));
        System.out.println(result6);

        System.out.println("Q7. Group numbers by remainder when divided by 3");
        List<Integer> groupNumbers7 = Arrays.asList(
                3, 4, 5, 6, 7, 8, 9
        );
        Map<Integer, List<Integer>> result7 = groupNumbers7.stream().collect(Collectors.groupingBy(n->n%3,Collectors.toList()));
        System.out.println(result7);

        System.out.println("Q8. Group words by uppercase first letter");
        List<String> words8 = Arrays.asList(
                "apple", "ant", "banana", "ball", "cat"
        );
        Map<Character,List<String>> result8 = words8.stream().collect(Collectors.groupingBy(s->Character.toUpperCase(s.charAt(0))));
        System.out.println(result8);

        System.out.println("Q9. Group numbers into positive, negative and zero");
        List<Integer> groupNumbers9 = Arrays.asList(
                -10, 5, 0, -3, 8, 0, -7
        );
        Map<String,List<Integer>> result9 = groupNumbers9.stream().collect(Collectors.groupingBy(n->n>0?"Positive":n<0?"Negative":"Zero"));
        System.out.println(result9);

        System.out.println("Q10. Group words by length and count");
        List<String> words10 = Arrays.asList(
                "Java", "SQL", "Spring", "AWS", "Docker", "API"
        );

        Map<Integer,Long> result10 = words10.stream().collect(Collectors.groupingBy(c->c.length(),Collectors.counting()));
        System.out.println(result10);

        System.out.println("Q11 — Group numbers into three categories");
        List<Integer> numbers11 = Arrays.asList(
                -5, 0, 10, -15, 20, 0, -3
        );
        Map<String,List<Integer>> groupResult11 = numbers11.stream().collect(Collectors.groupingBy(n->n>0?"Positive":n<0?"Negative":"Zero"));
        System.out.println(groupResult11);

        System.out.println("Q12 — Group names by uppercase first letter");
        List<String> names12 = Arrays.asList(
                "sai", "ravi", "suresh", "ramesh", "kumar"
        );

        Map<Character,List<String>> groupResult12 = names12.stream().collect(Collectors.groupingBy(s->Character.toUpperCase(s.charAt(0))));
        System.out.println(groupResult12);

        System.out.println("Q13 — Group numbers into two categories");
        List<Integer> numbers13 = Arrays.asList(
                10, 25, 20, 30, 15, 40
        );
        Map<String,List<Integer>> groupResult13 = numbers13.stream().collect(Collectors.groupingBy(n->n>20?"GreaterThan20":"LessThanOrEqual20"));
        System.out.println(groupResult13);


        System.out.println("Q1. Partition even and odd numbers");
        List<Integer> numbers1 = Arrays.asList(
                10, 15, 20, 25, 30, 35
        );
        Map<Boolean,List<Integer>> partitionResult1 = numbers1.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(partitionResult1);

        System.out.println("Q2. Partition numbers greater than 20");
        List<Integer> partitionNumbers2 = Arrays.asList(
                10, 25, 15, 40, 30, 5
        );
        Map<Boolean,List<Integer>> partitionResult2 = partitionNumbers2.stream().collect(Collectors.partitioningBy(n->n>20));
        System.out.println(partitionResult2);

        System.out.println("Q3. Partition names starting with S");
        List<String> partitionNames3 = Arrays.asList(
                "Sai", "Ravi", "Santosh", "Kumar", "Suresh"
        );

        Map<Boolean, List<String>> partitionResult3 = partitionNames3.stream()
                .collect(Collectors.partitioningBy(
                        n -> n.startsWith("S")
                ));

        System.out.println(partitionResult3);
        List<Integer> numbers4 = Arrays.asList(
                -10, 5, 0, -3, 8, 0, -7
        );
        Map<Boolean,List<Integer>> partitionResult4 = numbers4.stream().collect(Collectors.partitioningBy(n->n>0));
        System.out.println(partitionResult4);

        System.out.println("Q5. Partition names longer than 4 characters");
        List<String> names5 = Arrays.asList(
                "Sai", "Ramesh", "John", "Alexander", "Kumar"
        );

        Map<Boolean,List<String>> partitionResult5 = names5.stream().collect(Collectors.partitioningBy(n->n.length()>4));
        System.out.println(partitionResult5);

        System.out.println("Q6. Count even and odd numbers");
        List<Integer> numbers6 = Arrays.asList(
                10, 15, 20, 25, 30, 35, 40
        );
        Map<Boolean,Long> partitionResult6 = numbers6.stream().collect(Collectors.partitioningBy(n->n%2==0,Collectors.counting()));
        System.out.println(partitionResult6);

        System.out.println("Q7. Count names starting with A");
        List<String> names7 = Arrays.asList(
                "Amit", "Ravi", "Anil", "Kumar", "Arjun", "Sai"
        );

        Map<Boolean,Long> partitionResult7 = names7.stream().collect(Collectors.partitioningBy(n->n.startsWith("A"),Collectors.counting()));
        System.out.println(partitionResult7);

        System.out.println("Q8. Partition numbers divisible by 3");
        List<Integer> numbers8 = Arrays.asList(
                3, 4, 6, 7, 9, 10, 12
        );

        Map<Boolean,List<Integer>> partitionResult8= numbers8.stream().collect(Collectors.partitioningBy(n->n%3==0,Collectors.toList()));
        System.out.println(partitionResult8);

        System.out.println("Q9. Partition uppercase and lowercase words");
        List<String> words9 = Arrays.asList(
                "JAVA", "spring", "SQL", "docker", "AWS"
        );

        Map<Boolean,List<String>> partitionResult9 = words9.stream().collect(Collectors.partitioningBy(s->s.equals(s.toUpperCase()),Collectors.toList()));
        System.out.println(partitionResult9);

        System.out.println("Q10. Combine filtering, mapping and partitioning");
        List<Integer> partitionNumbers10 = Arrays.asList(
                5, 10, 15, 20, 25, 30, 35, 40
        );

        Map<Boolean,List<Integer>> partitionResult10 = partitionNumbers10.stream().filter(n->n>10).map(m->m*2).collect(Collectors.partitioningBy(s->s>50));
        System.out.println(partitionResult10);

    }
}
