package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny_13 {
       public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> result =
                list.stream().filter(i->i%2==0)
                        .findAny();

        System.out.println(result.get());


       
System.out.println("1. Find any element");
int[] arr1 = {10, 20, 30, 40, 50};
System.out.println(Arrays.stream(arr1).findAny().orElse(-1));


System.out.println("2. Find any even number");
int[] arr2 = {11, 15, 22, 31, 40, 51};
System.out.println(Arrays.stream(arr2)
        .filter(n -> n % 2 == 0)
        .findAny()
        .orElse(-1));


System.out.println("3. Find any number greater than 25");
int[] arr3 = {10, 20, 30, 40, 50};
System.out.println(Arrays.stream(arr3)
        .filter(n -> n > 25)
        .findAny()
        .orElse(-1));


System.out.println("4. Find any name");
String[] names4 = {"Sai", "Ravi", "Kumar", "John"};
System.out.println(Arrays.stream(names4).findAny().orElse("null"));


System.out.println("5. Find any name starting with S");
String[] names5 = {"Ravi", "Sai", "Santosh", "Kumar"};
System.out.println(Arrays.stream(names5)
        .filter(n -> n.startsWith("S"))
        .findAny()
        .orElse("null"));


System.out.println("6. Find any number after sorting");
int[] arr6 = {40, 10, 30, 20, 50};
System.out.println(Arrays.stream(arr6)
        .sorted()
        .findAny()
        .orElse(-1));


System.out.println("7. Find any odd number");
int[] arr7 = {2, 4, 6, 7, 9, 11};
System.out.println(Arrays.stream(arr7)
        .filter(n -> n % 2 != 0)
        .findAny()
        .orElse(-1));


System.out.println("8. Find any employee");
List<Employee> employees = Arrays.asList(
        new Employee("Sai", 50000),
        new Employee("Ravi", 40000),
        new Employee("Kumar", 60000)
);

Optional<Employee> e1 = employees.stream().findAny();
e1.ifPresent(e -> System.out.println(e.getName() + " - " + e.getSalary()));


System.out.println("9. Find any employee earning above 45000");
Optional<Employee> e2 = employees.stream()
        .filter(e -> e.getSalary() > 45000)
        .findAny();

e2.ifPresent(e -> System.out.println(e.getName() + " - " + e.getSalary()));


System.out.println("10. Combine filter, map, and findAny");
int[] arr10 = {3, 5, 8, 10, 12, 15};
System.out.println(Arrays.stream(arr10)
        .filter(n -> n > 5)
        .map(n -> n * 2)
        .findAny()
        .orElse(-1));
    }
}
