package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;



import java.util.Arrays;
import java.util.List;

public class StudentFlatMap {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("LC_13_RomanToInteger");
        s1.setCourses(Arrays.asList("Java","Python","SQL Server"));
        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Santosh");
        s2.setCourses(Arrays.asList("Data Structures","Spring boot"));
        List<Student> programming = Arrays.asList(s1,s2);

        programming.stream().flatMap(std->std.getCourses().stream()).forEach(System.out::println);

    }
}
