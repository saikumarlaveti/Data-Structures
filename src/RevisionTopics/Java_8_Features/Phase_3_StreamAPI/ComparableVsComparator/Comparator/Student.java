package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.ComparableVsComparator.Comparator;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;

public class Student {
    public int id;
    public String name;
    public int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Student> std = Arrays.asList(
                new Student(4,"Saikumar",24),
                new Student(1,"Santosh",26),
                new Student(7,"Hema",23)
        );
        System.out.println("Without sorting ");
        std.forEach(System.out::println);

        System.out.println("Id");
        //1.comparing using id
        std.sort(Comparator.comparing(Student::getId));
        std.forEach(System.out::println);

        System.out.println("age");
        //2.Comparing using age
        std.sort(Comparator.comparing(Student::getAge));
        std.forEach(System.out::println);

        System.out.println("reverse");
        std.sort(Comparator.comparing(Student::getAge).reversed());
        std.forEach(System.out::println);

        System.out.println("then comparing ");
        std.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));
        std.forEach(System.out::println);

    }
}
