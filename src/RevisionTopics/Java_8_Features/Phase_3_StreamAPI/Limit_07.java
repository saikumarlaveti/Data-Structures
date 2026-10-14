package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.*;

public class Limit_07 {
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
        numbers.stream().limit(3).forEach(System.out::println); //1,2,3
        List<String> names = Arrays.asList("LC_13_RomanToInteger","Santosh","Naveen","Naresh");
        names.stream().limit(2).forEach(System.out::println); //LC_13_RomanToInteger , Santosh


        System.out.println("1: Print the first 3 numbers");
        List<Integer> numbers1 =
                Arrays.asList(10, 20, 30, 40, 50, 60);
        numbers1.stream().limit(3).forEach(System.out::println);

        System.out.println("2: Print the first 2 names");
        List<String> names2 =
                Arrays.asList("Sai", "Ravi", "Kumar", "John", "Ramesh");

        names2.stream().limit(2).forEach(System.out::println);

        System.out.println("Filter numbers greater than 20 and print only the first 3 matching numbers.");
        List<Integer> numbers3 =
                Arrays.asList(10, 25, 40, 15, 30, 50, 20, 60);

        numbers3.stream().filter(n->n>20).limit(3).forEach(System.out::println);

        System.out.println("Sort the numbers in ascending order and print only the 5 smallest numbers.");
        List<Integer> numbers4 =
                Arrays.asList(50, 10, 40, 20, 60, 30, 70);
        numbers4.stream().sorted().limit(5).forEach(System.out::println);

        System.out.println("Remove duplicate numbers and print only the first 4 unique numbers.");
        List<Integer> numbers5 =
                Arrays.asList(10, 20, 10, 30, 40, 20, 50, 60);
        numbers5.stream().sorted().distinct().limit(4).forEach(System.out::println);

        System.out.println("Select even numbers, sort them in ascending order, and print only the first 3 numbers.");
        List<Integer> numbers6 =
                Arrays.asList(15, 8, 20, 3, 12, 6, 18, 10);
        numbers6.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Convert names to uppercase, remove duplicates, and print only the first 3 unique names.");
        List<String> names7 =
                Arrays.asList("sai", "ravi", "sai", "john", "ravi", "kumar");

        names7.stream().distinct().map(String::toUpperCase).limit(3).forEach(System.out::println);

        System.out.println("Sort employees by salary in descending order and print only the top 3 highest-paid employees.");
        List<Employee> employees8 = Arrays.asList(
                new Employee("Sai", 50000),
                new Employee("Ravi", 40000),
                new Employee("John", 65000),
                new Employee("Kumar", 55000),
                new Employee("Ramesh", 45000)
        );
        employees8.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(e -> System.out.println(
                        "Name - " + e.getName()
                                + " Salary - " + e.getSalary()
                ));
        System.out.println("Convert a nested list into a single stream, remove duplicate numbers, and print only the first 5 unique numbers.");
        List<List<Integer>> numbers9 = Arrays.asList(
                Arrays.asList(10, 20, 30),
                Arrays.asList(20, 40, 50),
                Arrays.asList(30, 60, 70)
        );

        numbers9.stream().flatMap(Collection::stream).sorted().limit(5).forEach(System.out::println);
        System.out.println("Filter numbers greater than 10, double each number, remove duplicates, sort in descending order, and print only the first 3 results.");

        List<Integer> numbers10 =
                Arrays.asList(5, 12, 15, 20, 12, 25, 30, 15, 40);

        numbers10.stream().filter(n->n>10).map(n->n*2).distinct().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
