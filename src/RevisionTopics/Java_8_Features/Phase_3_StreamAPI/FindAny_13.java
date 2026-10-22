package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny_13 {
    public static class Employee{
        String name;
        int salary;

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

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> result =
                list.stream().filter(i->i%2==0)
                        .findAny();

        System.out.println(result.get());


        System.out.println("1.Find the first elementGiven `int[] arr1 = {10, 20, 30, 40, 50};`, find the first element.");
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.stream(arr1).findFirst().orElse(-1));

        System.out.println("2.Find the first even number");
        int[] arr2 = {11, 15, 22, 31, 40, 51};
        System.out.println(Arrays.stream(arr2).filter(n->n%2==0).findFirst().orElse(-1));

        System.out.println("3.Find the first number greater than 25");
        int[] arr3 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.stream(arr3).filter(n->n>25).findFirst().orElse(-1));

        System.out.println("4.Find the first nameGiven");
        String[] names4 = {"Sai", "Ravi", "Kumar", "John"};
        System.out.println(Arrays.stream(names4).findFirst().orElse("null"));

        System.out.println("5.Find the first name starting with SGiven");
        String[] names5 = {"Ravi", "Sai", "Santosh", "Kumar"};
        System.out.println(Arrays.stream(names5).filter(n->n.startsWith("S")).findFirst().orElse("null"));

        System.out.println("6.Find the first number after sortingGiven");
        int[] arr6 = {40, 10, 30, 20, 50};
        System.out.println(Arrays.stream(arr6).sorted().findFirst().orElse(-1));

        System.out.println("7.Find the first odd numberGiven");
        int[] arr7 = {2, 4, 6, 7, 9, 11};
        System.out.println(Arrays.stream(arr7).filter(n->n%2==1).findFirst().orElse(-1));

        System.out.println("8.Find the first employeeGiven");
        List<Employee> employees = Arrays.asList(new Employee("Sai",50000),
                new Employee("Ravi",40000),
                new Employee("Kumar",60000));

        Optional<Employee> e1 = employees.stream().findFirst();
        System.out.println(e1);

        System.out.println("9.Find the first employee earning above 45000 Use the same employees as Q8. Filter employees whose salary is greater than 45000");
        Optional<Employee> e2 = employees.stream().filter(n->n.salary>45000).findFirst();
        System.out.println(e2);

        System.out.println("10.Combine filter, map, and findFirst");
        int[] arr10 = {3,5,8,10,12,15};
        System.out.println(Arrays.stream(arr10).filter(n->n>5).map(n->n*2).findFirst());
    }
}
