package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ForEach_01 {
    public static void main(String[] args) {
        //Example - 1
        List<String> names = Arrays.asList("Java","Spring Boot","Mysql");
        System.out.println("without forEach( ) method :: ");
        for(int i = 0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println("with forEach( ) method :: ");
        names.forEach(System.out::println);

        //Example -2
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println("without forEach( ) method :: ");
        for(int j = 0;j<nums.size();j++){
            if(nums.get(j)%2==0){
                System.out.println(nums.get(j));
            }
        }
        System.out.println("with forEach( ) method :: ");
        nums.stream().filter(n->n%2==0).forEach(System.out::println) ;

        //Example -3
        int[] arr = {5,6,7,8,9,10};
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("/*=============================================== */");
        System.out.println("problem - 1 Print all numbers");
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        numbers.stream().forEach(System.out::println);
        numbers.forEach(System.out::println);

        System.out.println("problem - 2 Print all names");
        List<String> name = Arrays.asList("Sai", "Ravi", "John", "David");
        name.forEach(System.out::println);

        System.out.println("problem - 3 - Print numbers greater than 25");
        List<Integer> num= Arrays.asList(10, 20, 30, 40, 15, 50);
        num.stream().filter(n->n>25).forEach(System.out::println);

        System.out.println("problem - 4 - Perform an action");
        List<Integer> num1 = Arrays.asList(2, 4, 6, 8);
        num1.stream().map(n->n*n).forEach(System.out::println);

        System.out.println("problem - 5 - Convert names to uppercase and print");
        List<String> name1 = Arrays.asList("sai", "ravi", "john");
        name1.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("problem - 6 - Add 10 to every number and print");
        List<Integer> num2 = Arrays.asList(10, 20, 30, 40);
        num2.stream().map(n->n+10).forEach(System.out::println);

        System.out.println("problem - 7 - Print even numbers");
        List<Integer> num3 = Arrays.asList(11, 20, 35, 40, 52, 63, 70);
        num3.stream().filter(n->n%2==0).forEach(System.out::println);

        System.out.println("problem - 8 - Print names whose length is greater than 4");
        List<String> names3 = Arrays.asList(
                "Sai",
                "Ravi",
                "Kumar",
                "John",
                "Alexander"
        );
        names3.stream().filter(nam->nam.length()>4).forEach(System.out::println);
        System.out.println("Problem - 9 : Calculate and print salary after adding ₹5,000");
        List<Integer> salaries = Arrays.asList(30000, 40000, 50000);
        salaries.stream().map(n->n+5000).forEach(System.out::println);

        System.out.println("Problem - 10 : Employee names");
        List<String> employees = Arrays.asList(
                "Saikumar",
                "Ravi",
                "Anil",
                "John"
        );

        employees.stream().forEach(n->System.out.println("Welcome " + n));
        System.out.println("Problem - 11 : ");
        List<Integer> num4 = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        num4.stream().filter(n->n==20||n==40).forEach(System.out::println);
    }
}
