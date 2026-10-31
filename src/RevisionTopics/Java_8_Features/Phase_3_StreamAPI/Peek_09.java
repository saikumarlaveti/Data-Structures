package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Peek_09 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.stream().peek(num-> System.out.println("Before : "+num)).map(n->n*2).forEach(System.out::println);


        List<String> names = Arrays.asList("LC_13_RomanToInteger","Santosh","Naveen","Naresh");
        names.stream()
                .peek(name -> System.out.println("Processing: " + name))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        System.out.println("Use peek() to print each number, then use forEach() to print it again.");
        List<Integer> numbers1 = Arrays.asList(10, 20, 30, 40, 50);
        numbers1.stream().peek(n->System.out.println("Peek " + n)).forEach(System.out::println);

        System.out.println("Print every number using peek(), then filter numbers greater than 20 and print the results.");
        List<Integer> numbers2 = Arrays.asList(10, 25, 15, 30, 40);
        numbers2.stream().peek(n-> System.out.println("Peek " + n)).filter(n->n>20).forEach(System.out::println);

        System.out.println("Filter numbers greater than 20, inspect the remaining numbers using peek(), and print them.");
        List<Integer> numbers3 = Arrays.asList(10, 25, 15, 30, 40);
        numbers3.stream().filter(n->n>20).peek(n-> System.out.println("Peek " + n)).forEach(System.out::println);

        System.out.println("Print the original numbers using peek(), double them using map(), then print the transformed numbers using another peek().");
        List<Integer> numbers4 = Arrays.asList(10, 20, 30);
        numbers4.stream().peek(n-> System.out.println("Before Map: " + n))
                .map(n->n*2).peek(n-> System.out.println("After  Map: " + n))
                .forEach(System.out::println);


        System.out.println("Inspect the numbers, remove duplicates, and print the unique values.");
        List<Integer> numbers5 = Arrays.asList(10, 20, 10, 30, 20, 40);
        numbers5.stream().peek(n-> System.out.println("Peek :" + n)).distinct().forEach(System.out::println);

        System.out.println("Sort the numbers in ascending order, inspect them using peek(), and print them.");
        List<Integer> numbers6 = Arrays.asList(40, 10, 30, 20);
        numbers6.stream().sorted().peek(n-> System.out.println("Peek " + n)).forEach(System.out::println);

        System.out.println("Skip the first two numbers, inspect the remaining elements, and print them.");
        List<Integer> numbers7 =  Arrays.asList(10, 20, 30, 40, 50);
        numbers7.stream().skip(2).peek(n-> System.out.println("Peek " +n)).forEach(System.out::println);

        System.out.println("Inspect the first three numbers selected by limit(3) and print them.");
        List<Integer> numbers8 = Arrays.asList(10, 20, 30, 40, 50);
        numbers8.stream().limit(3).peek(n-> System.out.println("Peek " + n)).forEach(System.out::println);

        System.out.println("Filter employees earning more than ₹45,000, inspect their names and salaries using peek(), and print their details.");
        List<Employee> employees9 = Arrays.asList(
                new Employee("Sai", 50000),
                new Employee("Ravi", 40000),
                new Employee("John", 65000),
                new Employee("Kumar", 45000)
        );

        employees9.stream().filter(e-> e.getSalary() >45000).peek(e-> System.out.println(e.getName() + " " + e.getSalary())).forEach(System.out::println);


        System.out.println("Inspect the original numbers, filter numbers greater than 10, double them, inspect the transformed values, sort them in descending order, and print the final results.");
        List<Integer> numbers10 = Arrays.asList(5, 12, 20, 15, 30);

        numbers10.stream().peek(n-> System.out.println("Peek " +n))
                .filter(n->n>10)
                .map(n->n*2)
                .peek(n-> System.out.println("Peek " + n))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
