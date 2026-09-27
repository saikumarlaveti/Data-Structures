package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Filter_02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Even Numbers :");
        Arrays.stream(arr).filter(n->n%2==0).forEach(System.out::println);
        System.out.println("Odd Numbers :");
        Arrays.stream(arr).filter(n->n%2==1).forEach(System.out::println);

        System.out.println("Without Filter_02 API");
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        for (int j : arr) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
            }
        }

        System.out.println(" Problem : 1 - Print numbers greater than 50");
        List<Integer> num1 = Arrays.asList(10, 25, 55, 70, 40, 90);
        num1.stream().filter(n->n>50).forEach(System.out::println);
        System.out.println("Problem : 2 - Print even numbers ");
        List<Integer> num2 = Arrays.asList(11, 20, 35, 42, 53, 64, 77);
        num2.stream().filter(n->n%2==0).forEach(System.out::println);
        System.out.println("Problem : 3 - Print odd numbers");
        List<Integer> num3 = Arrays.asList(10, 15, 22, 31, 40, 55);
        num3.stream().filter(n->n%2==1).forEach(System.out::println);
        System.out.println("Problem : 4 - Print names starting with \"S\"");
        List<String> names = Arrays.asList(
                "Sai", "Ravi", "Suresh", "John", "Sanjay"
        );
        names.stream().filter(name->name.startsWith("S")).forEach(System.out::println);
        System.out.println("Problem : 5 - Print names whose length is greater than 5");
        List<String> name1 = Arrays.asList(
                "Sai",
                "Ravi",
                "Kumar",
                "Saikumar",
                "Alexander"
        );
        name1.stream().filter(name->name.length()>5).forEach(System.out::println);
        System.out.println("Problem : 6 - Print names containing \"a\"");
        List<String> name2 = Arrays.asList(
                "Sai", "Ravi", "John", "David", "Kumar"
        );
        name2.stream().filter(n->n.contains("a")).forEach(System.out::println);
        System.out.println("Problem : 7 - Employee salaries greater than ₹40,000");
        List<Integer> salaries = Arrays.asList(
                25000, 45000, 30000, 60000, 55000
        );
        salaries.stream().filter(salary->salary>40000).forEach(System.out::println);
        System.out.println("Problem : 8 - Students who passed");
        List<Integer> marks = Arrays.asList(
                35, 78, 42, 25, 90, 38, 65
        );
        marks.stream().filter(m->m>=40).forEach(System.out::println);
        System.out.println("Problem : 9 - Products whose price is less than ₹1,000 ");
        List<Integer> prices = Arrays.asList(
                500, 1500, 750, 2000, 999, 1200
        );
        prices.stream().filter(n->n<1000).forEach(System.out::println);

        System.out.println("Problem : 10 - Print numbers between 20 and 50");
        List<Integer> num4 = Arrays.asList(
                10, 20, 25, 35, 50, 55, 45, 60
        );
        num4.stream().filter(n->n>=20 && n<=50).forEach(System.out::println);
        System.out.println("Problem : 11 - Print names that start with \"S\" AND have length greater than 4 ");
        List<String> name3 = Arrays.asList(
                "Sai",
                "Suresh",
                "Sam",
                "Sanjay",
                "Ravi",
                "Sunil"
        );
        name3.stream().filter(n->n.startsWith("S") && n.length()>4).forEach(System.out::println);

        System.out.println("Problem : 12 -  Find employees eligible for promotion An employee is eligible if their salary is ≥ ₹50,000.");
        List<Integer> salary = Arrays.asList(
                35000, 50000, 45000, 75000, 60000, 30000
        );
        salary.stream().filter(sal->sal>=50000).forEach(System.out::println);



    }
}
