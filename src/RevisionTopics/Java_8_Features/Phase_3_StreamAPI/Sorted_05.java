package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Employee {
    private String name;
    private int salary;

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
    // constructor + getters
}
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

        System.out.println("9. Double numbers and sort them");
        List<Integer> numbers9 = Arrays.asList(
                5, 2, 8, 3, 1
        );

        numbers9.stream().sorted().map(n->n*2).forEach(System.out::println);

        System.out.println("10. Convert names to uppercase and sort alphabetically");
        List<String> names10 = Arrays.asList(
                "sai",
                "ravi",
                "john",
                "anil",
                "kumar"
        );
        names10.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("11. Find name lengths and sort them");
        List<String> names11 = Arrays.asList(
                "Java",
                "Spring",
                "AWS",
                "Microservices",
                "SQL"
        );

        names11.stream().map(String::length).sorted().forEach(System.out::println);

        System.out.println("12. Convert names to their lengths and sort descending");
        List<String> names12 = Arrays.asList(
                "Java",
                "Spring",
                "AWS",
                "Microservices",
                "SQL"
        );

        names12.stream().map(String::length).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("13. Sort names by length");
        List<String> names13 = Arrays.asList(
                "Alexander",
                "Sai",
                "Kumar",
                "Ravi",
                "John"
        );

        names13.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        System.out.println("14. Sort names by length in descending order");
        List<String> names14 = Arrays.asList(
                "Alexander",
                "Sai",
                "Kumar",
                "Ravi",
                "John"
        );

        names14.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        System.out.println("15. Sort strings by their first character");
        List<String> names15 = Arrays.asList(
                "Ravi",
                "Anil",
                "Kumar",
                "David",
                "Sai"
        );

        names15.stream().sorted(Comparator.comparing(n->n.charAt(0))).forEach(System.out::println);

        System.out.println("16. Filter → map → sort Requirements:\n" +
                "1. Select numbers greater than 20\n" +
                "2. Double them\n" +
                "3. Sort ascending\n" +
                "4. Print");
        List<Integer> numbers16 = Arrays.asList(
                10, 25, 40, 15, 30, 50, 20
        );

        numbers16.stream().filter(n->n>20).map(n->n*2).sorted().forEach(System.out::println);

        System.out.println("17. Filter → sort → map Select even numbers\n" +
                "Sort them ascending\n" +
                "Add 100\n" +
                "Print");

        List<Integer> numbers17 = Arrays.asList(
                10, 25, 40, 15, 30, 50, 20
        );

        numbers17.stream().filter(n->n%2==0).sorted().map(n->n+100).forEach(System.out::println);

        System.out.println("18. Flatten → sort ");
        List<List<Integer>> numbers18 = Arrays.asList(
                Arrays.asList(50, 20, 10),
                Arrays.asList(40, 60, 30),
                Arrays.asList(90, 70, 80)
        );

        numbers18.stream().flatMap(Collection::stream).sorted().forEach(System.out::println);

        System.out.println("19. Flatten → filter → sort Flatten\n" +
                "Keep numbers greater than 40\n" +
                "Sort descending\n" +
                "Print");

        List<List<Integer>> numbers19 = Arrays.asList(
                Arrays.asList(50, 20, 10),
                Arrays.asList(40, 60, 30),
                Arrays.asList(90, 70, 80)
        );

        numbers19.stream().flatMap(Collection::stream).filter(n->n>40).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("20.Sort employees by salary");
        List<Employee> employees = Arrays.asList(
                new Employee("Sai", 50000),
                new Employee("Ravi", 40000),
                new Employee("John", 60000),
                new Employee("Kumar", 45000)
        );
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(e ->
                        System.out.println(e.getName() + " - " + e.getSalary()));
        System.out.println("21. Sort employees by salary descending");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(e-> System.out.println(e.getName() + " - " + e.getSalary()));


        System.out.println("22. Sort employees by name");
        List<Employee> employees1 = Arrays.asList(
                new Employee("Sai", 50000),
                new Employee("Ravi", 40000),
                new Employee("John", 60000),
                new Employee("Kumar", 45000)
        );
        employees1.stream().sorted(Comparator.comparing(Employee::getName)).forEach(e->System.out.println(e.getName()+" - " + e.getSalary()));

        System.out.println("23. Sort employees by salary, then name");
        List<Employee> employees23 = Arrays.asList(
                new Employee("Sai", 50000),
                new Employee("Ravi", 40000),
                new Employee("John", 50000),
                new Employee("Kumar", 40000)
        );
        employees23.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).forEach(e->System.out.println(e.getName()+ " - " + e.getSalary()));

        System.out.println("24. Salary descending, name ascending");
        employees23.stream().sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName)).forEach(e->System.out.println(e.getName() + " - " + e.getSalary()));

        System.out.println(" 25.Select employees with salary greater than ₹40,000\n" +
                "Sort them by salary descending\n" +
                "Convert each employee into:");

        List<Employee> employees25 = Arrays.asList(
                new Employee("Sai", 50000),
                new Employee("Ravi", 30000),
                new Employee("John", 60000),
                new Employee("Kumar", 45000),
                new Employee("Anil", 70000)
        );

        employees25.stream().filter(e->e.getSalary()>40000).sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(e->System.out.println(e.getName() + " earns ₹ " + e.getSalary()));

        System.out.println("Flatten all employees\n" +
                "Keep names starting with \"s\"\n" +
                "Convert to uppercase\n" +
                "Sort alphabetically\n" +
                "Add \"Developer: \" before each name\n" +
                "Print");

        List<List<String>> employees26 = Arrays.asList(
                Arrays.asList("saikumar", "ravi"),
                Arrays.asList("suresh", "john"),
                Arrays.asList("sanjay", "kumar"),
                Arrays.asList("sunil", "anil")
        );

        employees26.stream().flatMap(Collection::stream).filter(s->s.startsWith("s")).map(String::toUpperCase).sorted().forEach(e-> System.out.println("Developer :" + e));



    }
}
