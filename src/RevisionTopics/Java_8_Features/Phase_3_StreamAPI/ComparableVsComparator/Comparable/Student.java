package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.ComparableVsComparator.Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    public int id;
    public String name;
    public int salary;

    public Student(int id, String name,int salary){
        this.id  = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Student o) {
        return this.salary-o.salary;
    }
    @Override
    public String toString() {
        return "Student{" +"id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }

    public static void main(String[] args) {
        List<Student> std = Arrays.asList(
                new Student(1,"LC_13_RomanToInteger",10000),
                new Student(2,"Santosh",30000),
                new Student(3,"Hema",11000)
        );
        Collections.sort(std);
        System.out.println(std);
    }
}
