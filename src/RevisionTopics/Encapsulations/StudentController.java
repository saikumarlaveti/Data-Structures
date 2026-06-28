package RevisionTopics.Encapsulations;

public class StudentController {
    public static void main(String[] args) {
        Student std = new Student();
        std.setId(40);
        std.setName("LC_13_RomanToInteger");
        System.out.println(std.getId());
        System.out.println(std.getName());
    }
}
