package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.ComparableVsComparator.Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee  implements Comparable<Employee>{
public int id;
    public String name;
    public int age;

    public  Employee(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

 //   @Override
//    public int compareTo(Employee obj) {
//        return this.age-obj.age;
//    }

    public int compareTo(Employee obj){
        return this.id - obj.id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(4,"LC_13_RomanToInteger",24),
                new Employee(1,"Santosh",26),
                new Employee(7,"Hema",23)
        );
       Collections.sort(emp);
        System.out.println(emp);

        System.out.println("Using Java 8 feature ::");
        emp.stream().sorted().forEach(System.out::println);




    }
}
