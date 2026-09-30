package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_03 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums.stream().map(n->n*2).forEach(System.out::println);

        List<String> names = Arrays.asList("LC_13_RomanToInteger","Santosh","Naveen");
        System.out.println(names);
        names.stream().map(n->n.toUpperCase()).forEach(System.out::println);  //both are same output
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        names.stream().map(String::length).forEach(System.out::println);
        List<String> name = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<Integer> length = names.stream().map(String::length).toList();
        System.out.println(name);  //[SAIKUMAR, SANTOSH, NAVEEN]
        System.out.println(length);  // [8, 7, 6]

        System.out.println("1. Double every number");
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        numbers.stream().map(n->n*2).forEach(System.out::println);

        System.out.println("Add 5 to every number");
        List<Integer> num1 = Arrays.asList(10, 20, 30, 40);
        num1.stream().map(n->n+5).forEach(System.out::println);

        System.out.println("Find the square of every number");
        List<Integer> num2 = Arrays.asList(2, 3, 4, 5, 6);
        num2.stream().map(n->n*n).forEach(System.out::println);

        System.out.println("4. Convert names to uppercase");
        List<String> name1 = Arrays.asList(
                "sai", "ravi", "john", "kumar"
        );
        name1.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("5. Convert names to lowercase");
        List<String> name2 = Arrays.asList(
                "SAI", "RAVI", "JOHN", "KUMAR"
        );
        name2.stream().map(String::toLowerCase).forEach(System.out::println);

        System.out.println("6. Find the length of every name");
        List<String> name3 = Arrays.asList(
                "Sai", "Ravi", "Kumar", "Saikumar"
        );
        name3.stream().map(String::length).forEach(System.out::println);

        System.out.println("7. Add ₹5,000 to every salary");
        List<Integer> salaries = Arrays.asList(
                30000, 40000, 50000, 60000
        );
        salaries.stream().map(n->n+5000).forEach(System.out::println);

        System.out.println("8. Convert Celsius to Fahrenheit");
        List<Double> temperatures = Arrays.asList(
                0.0, 10.0, 20.0, 30.0
        );
        temperatures.stream().map(n->(n* 9/5) + 32).forEach(System.out::println);

        System.out.println("9. Convert all names to uppercase using a method reference");
        List<String> name5 = Arrays.asList(
                "saikumar", "ravi", "john"
        );

        name5.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("10. Remove leading/trailing spaces from every name");
        List<String> name6 = Arrays.asList(
                " Sai ",
                " Ravi",
                "John ",
                " Kumar "
        );
        name6.stream().map(String::trim).forEach(System.out::println);

        System.out.println("11. Convert Strings to their lengths");
        List<String> name7 = Arrays.asList(
                "Java",
                "Spring",
                "Microservices",
                "MySQL"
        );
        name7.stream().map(n->Integer.parseInt(String.valueOf(n.length()))).forEach(System.out::println);

        System.out.println("12. Convert numbers to Strings");
        List<Integer> num8 = Arrays.asList(
                10, 20, 30, 40
        );
        num8.stream().map(String::valueOf).forEach(System.out::println);

        System.out.println("13. Double every number and then print");
        List<Integer> num9 = Arrays.asList(
                5, 10, 15, 20
        );
        num9.stream().map(n->n*2).forEach(System.out::println);

        System.out.println("14. Convert names to uppercase and find their lengths");
        List<String> name9 = Arrays.asList(
                "sai",
                "ravi",
                "kumar",
                "john"
        );
        name9.stream().map(String::toUpperCase).map(String::length).forEach(System.out::println);

        System.out.println("15. Calculate final salary");
        List<Double> salaries1 = Arrays.asList(
                30000.0,
                40000.0,
                50000.0
        );
        salaries1.stream().map(n->n+(n/10)).forEach(System.out::println);






    }

}
