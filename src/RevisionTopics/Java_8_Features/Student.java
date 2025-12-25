package RevisionTopics.Java_8_Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student[] s = {
                new Student("Saikumar", 95),
                new Student("Lokesh", 85),
                new Student("Pradesh", 56),
                new Student("Venkat", 30)
        };
        //Predicate interface
        Predicate<Student> pass = p -> p.marks > 60;
        //Function interface
        Function<Student, String> check = m -> {
            String grade = "";
            if (m.marks > 90) {
                grade = "First";
            } else if (m.marks > 75) {
                grade = "Second";
            } else if (m.marks > 55) {
                grade = "Third";
            } else {
                grade = "FAIL";
            }
            return grade;
        };

        //consumer interface return void
        Consumer<Student> display = s1->{
            System.out.println("Name- " + s1.name);
            System.out.println("Marks- " + s1.marks);
            System.out.println(check.apply(s1));
            System.out.println();
        };
        for (Student s1 : s) {
                if(pass.test(s1)){
//                System.out.println("Name- " + s1.name);
//                System.out.println("Marks- " + s1.marks);
//                System.out.println(check.apply(s1));
//                System.out.println();
                    display.accept(s1);
            }
        }
        Function<Integer,Integer> num1 = i->i*2;
        Function<Integer,Integer> num2 = i->i*i*i;
        System.out.println(num1.andThen(num2).apply(2)); //64
        System.out.println(num1.compose(num2).apply(2)); // 16

        Consumer<String > names = n1 -> System.out.println(n1);
        names.accept("Hello"); //Hello
        names.accept("World"); // World

    }
}
