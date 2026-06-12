package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.GroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {
    public int id;
    public String name;
    public int age;

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

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
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
                new Student(1,"Saikumar",24),
                new Student(2,"Santosh",25),
                new Student(3,"Eswara Rao",27),
                new Student(4,"Ganesh",27),
                new Student(5,"Naresh",28),
                new Student(6,"Naresh",28)
        );

        Map<Integer, Long> age = std.stream().collect(
                Collectors.groupingBy(
                        Student::getAge,
                        Collectors.counting())
        );
        System.out.println(age); //{24=1, 25=1, 27=2, 28=2}

        Map<Integer,List<String>> namesGroupByAge = std.stream().collect(
                Collectors.groupingBy(
                        Student::getAge,
                        Collectors.mapping(
                                Student::getName,
                                Collectors.toList()
                        )
                )
                );
        System.out.println(namesGroupByAge) ; //
            List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            Map<String,List<Integer>> no = nums.stream().collect(
                    Collectors.groupingBy(
                            n->n%2==0?"Even":"Odd"
                    ));

        System.out.println(no);



    }
}
