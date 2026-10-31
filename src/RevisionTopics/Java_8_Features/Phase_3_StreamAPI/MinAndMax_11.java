package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MinAndMax_11 {
    public static class Employee{
        String name ;
        int salary;
        public  Employee(String name, int salary){
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
        List<Integer> num = Arrays.asList(1,2,7,8,3,4);

        // public int compareTo(Integer anotherInteger) {
        //        return compare(this.value, anotherInteger.value);
        //    }
        Optional<Integer> min = num.stream().min(Integer::compareTo);
        System.out.println(min.get());

        Optional<Integer> max = num.stream().max(Integer::compareTo);
        System.out.println(max.get());

        System.out.println("1.Find the minimum number");
        int[] arr1 = new int[]{10, 20, 5, 40, 15, 2, 30};
        OptionalInt  result1 =Arrays.stream(arr1).min();
        System.out.println(result1);

        System.out.println("2.Find the Maximum number");
        int[] arr2 = new int[]{10, 20, 5, 40, 15, 2, 30};
        OptionalInt  result2 =Arrays.stream(arr2).max();
        System.out.println(result2);

        System.out.println("3.Find the Maximum number");
        int[] arr3 = new int[]{15, 22, 8, 31, 14, 6, 19};
        OptionalInt  result3 =Arrays.stream(arr3).filter(n->n%2==0).min();
        System.out.println(result3);

        System.out.println("4.Find the maximum odd number");
        int[] arr4 = new int[]{12, 25, 18, 39, 44, 51, 30};
        OptionalInt  result4 =Arrays.stream(arr4).filter(n->n%2==1).max();
        System.out.println(result4);

        System.out.println("5.Find the shortest name");
        String[] names5 = new String[]{"Sai", "Ravi", "Kumar", "John", "Anil"};
        Optional<String> result5 = Arrays.stream(names5).min(Comparator.comparing(String::length));
        System.out.println(result5);

        System.out.println("6.Find the longest name");
        String[] names6 = new String[]{"Sai", "Ravi", "Kumar", "John", "Anil"};
        Optional<String> result6 = Arrays.stream(names6).max(Comparator.comparing(String::length));
        System.out.println(result6);

        System.out.println("7.Find the minimum number greater than 20");
        int[] arr7 = new int[]{10, 25, 40, 15, 30, 50, 20, 60};
        OptionalInt result7 = Arrays.stream(arr7).filter(n->n>20).min();
        System.out.println(result7);

        System.out.println("8.Find the employee with the highest salary");
        List<Employee> name8 = Arrays.asList(
                new Employee("Saikumar",5000),
                new Employee("Santosh",9000),
                new Employee("Naveen",4000)
        );

        Optional<Employee> result8 = name8.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(result8);

        Optional<Employee> result9 = name8.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println(result9);

        System.out.println("10.Filter numbers greater than 10.\n" +
                "Double each number using map().\n" +
                "Remove duplicates using distinct().\n" +
                "Find the maximum using max().");

        int[] arr10 = new int[]{5, 12, 15, 20, 12, 25, 30, 15, 40};

        OptionalInt result10 = Arrays.stream(arr10).filter(n->n>10)
                .map(n->n*2).distinct().max();
        System.out.println(result10);


    }
}
