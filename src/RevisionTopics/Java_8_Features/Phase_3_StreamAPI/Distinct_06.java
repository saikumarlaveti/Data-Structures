package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.awt.*;
import java.util.*;
import java.util.List;


public class Distinct_06 {
    public static class  Employee{
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,2,4,6,7,8,1);
        numbers.stream().distinct().forEach(System.out::println);
        List<String> names = Arrays.asList("LC_13_RomanToInteger","Santosh","LC_13_RomanToInteger","Naresh","Naresh");
        names.stream().distinct().forEach(System.out::println);

        System.out.println("1. Print unique integers");
        List<Integer> numbers1 = Arrays.asList(
                10, 20, 10, 30, 20, 40, 30, 50
        );
        numbers1.stream().distinct().forEach(System.out::println);

        System.out.println("2. Remove duplicate names");
        List<String> names2 = Arrays.asList(
                "Sai", "Ravi", "Sai", "Kumar", "Ravi", "John"
        );
        names2.stream().distinct().forEach(System.out::println);

        System.out.println("3. Distinct → sorted");
        List<Integer> numbers3 = Arrays.asList(
                50, 20, 10, 40, 20, 30, 10, 50, 60
        );
        numbers3.stream().distinct().sorted().forEach(System.out::println);

        System.out.println("4. Filter → distinct -  Keep numbers greater than 25, remove duplicates, and print.");
        List<Integer> numbers4 = Arrays.asList(
                10, 30, 40, 30, 50, 20, 40, 60, 50
        );
        numbers4.stream().filter(n->n>25).distinct().forEach(System.out::println);

        System.out.println("5.Convert names to uppercase, then remove duplicates.");
        List<String> names5 = Arrays.asList(
                "sai", "ravi", "SAI", "john", "ravi", "JOHN"
        );
        names5.stream().map(String::toUpperCase).distinct().forEach(System.out::println);

        System.out.println("Filter even numbers, remove duplicates, and sort descending");
        List<Integer> numbers6 = Arrays.asList(
                10, 25, 20, 10, 30, 25, 40, 20, 50, 30
        );
        numbers6.stream().filter(n->n%2==0).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Flatten the lists, remove duplicates, and sort alphabetically.");
        List<List<String>> words7 = Arrays.asList(
                Arrays.asList("Java", "Spring", "SQL"),
                Arrays.asList("Java", "Linux", "Spring"),
                Arrays.asList("Python", "SQL", "Linux")
        );

        words7.stream().flatMap(n->n.stream()).distinct().sorted(Comparator.comparing(n->n.charAt(0))).forEach(System.out::println);

        System.out.println("Count the number of unique integers.");
        List<Integer> numbers8 = Arrays.asList(
                10, 20, 10, 30, 20, 40, 50, 30, 60, 50
        );

        long result = numbers8.stream().distinct().count();
        System.out.println(result);

        System.out.println("Convert names to lengths, remove duplicate lengths, and sort ascending.");
        List<String> names9 = Arrays.asList(
                "Sai", "Ravi", "John", "Kumar",
                "Anil", "David", "Alexander", "Raj"
        );
        names9.stream().map(String::length).distinct().sorted().forEach(System.out::println);

        System.out.println("Print each employee name only once, even when the salaries differ");
        List<Employee> employees10 = Arrays.asList(
                new Employee("Sai", 50000),
                new Employee("Ravi", 40000),
                new Employee("Sai", 60000),
                new Employee("John", 45000),
                new Employee("Ravi", 55000)
        );
        Set<String> seenNames = new HashSet<>();

        employees10.stream().filter(e-> seenNames.add(e.getName())).
                distinct().forEach(e-> System.out.println("Name - " + e.name + " Salary " + e.salary));
    }
}
