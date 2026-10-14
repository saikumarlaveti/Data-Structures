package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Skip_08 {
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
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream().skip(3).forEach(System.out::println); //4,5,6,7,8,9,10

        List<String> names = Arrays.asList("LC_13_RomanToInteger","Santosh","Naveen","Naresh");
        names.stream().skip(2).forEach(System.out::println); //Naveen , Naresh

        System.out.println("Skip the first two elements and print the remaining numbers.");
        List<Integer> numbers1 =
                Arrays.asList(10, 20, 30, 40, 50, 60);
        numbers1.stream().skip(2).forEach(System.out::println);

        System.out.println("Skip the first three names and print the remaining names.");
        List<String> names2 =
                Arrays.asList("Sai", "Ravi", "Kumar", "John", "Anil", "Ramesh");
        names2.stream().skip(3).forEach(System.out::println);

        System.out.println("Filter numbers greater than 20, then skip the first two matching numbers.");
        List<Integer> numbers3 =
                Arrays.asList(10, 25, 40, 15, 30, 50, 20, 60);

        numbers3.stream().filter(n->n>20).skip(2).forEach(System.out::println);

        System.out.println("Sort the numbers in ascending order and skip the first three smallest numbers.");
        List<Integer> numbers4 =
                Arrays.asList(50, 10, 40, 20, 60, 30, 70);

        numbers4.stream().sorted().skip(3).forEach(System.out::println);

        System.out.println("Remove duplicate numbers and skip the first two unique numbers.");
        List<Integer> numbers5 =
                Arrays.asList(10, 20, 10, 30, 40, 20, 50, 60);

        numbers5.stream().distinct().skip(2).forEach(System.out::println);

        System.out.println("Select even numbers, sort them in ascending order, and skip the first three.");
        List<Integer> numbers6 =
                Arrays.asList(15, 8, 20, 3, 12, 6, 18, 10);

        numbers6.stream().filter(n->n%2==0).sorted().skip(3).forEach(System.out::println);

        System.out.println("Convert names to uppercase and skip the first two names.");
        List<String> names7 =
                Arrays.asList("sai", "ravi", "john", "kumar", "anil");

        names7.stream().map(String::toUpperCase).skip(2).forEach(System.out::println);

        System.out.println("Sort employees by salary in descending order and skip the two highest-paid employees.");
        List<Employee> employees8 = Arrays.asList(
                new Employee("Sai", 50000),
                new Employee("Ravi", 40000),
                new Employee("John", 65000),
                new Employee("Kumar", 55000),
                new Employee("Anil", 70000)
        );

        employees8.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).forEach(System.out::println);

        System.out.println("Flatten the nested list, remove duplicates, sort in ascending order, and skip the first three numbers.");
        List<List<Integer>> numbers9 = Arrays.asList(
                Arrays.asList(10, 20, 30),
                Arrays.asList(20, 40, 50),
                Arrays.asList(30, 60, 70)
        );

        numbers9.stream().flatMap(Collection::stream).distinct().sorted().skip(3).forEach(System.out::println);

        System.out.println("Filter numbers greater than 10, double them, remove duplicates, sort in descending order, skip the first two results, and print the remaining numbers.");
        List<Integer> numbers10 =
                Arrays.asList(5, 12, 15, 20, 12, 25, 30, 15, 40);

        numbers10.stream().filter(n->n>10).map(n->n*2).distinct().sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);
    }
}
