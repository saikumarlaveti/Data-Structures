package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_04 {
    public static void main(String[] args) {
        List<List<Integer> >list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9));

        list.stream().map(l->l.stream()).forEach(System.out::println);
        /*
        java.util.stream.ReferencePipeline...
        java.util.stream.ReferencePipeline...
         java.util.stream.ReferencePipeline...
         */
         list.stream().flatMap(list1->list1.stream()).forEach(System.out::println);
         list.stream().flatMap(l->l.stream().map(l1->l1*2)).forEach(System.out::println);

         List<List<String>> names = Arrays.asList(
                 Arrays.asList("LC_13_RomanToInteger,Santosh"),
                 Arrays.asList("Naveen","Naresh"),
                 Arrays.asList("Ganesh","Eswara Rao")
         );

         names.stream().flatMap(n->n.stream()).forEach(System.out::println);
         /*
         LC_13_RomanToInteger,Santosh
        Naveen
        Naresh
        Ganesh
        Eswara Rao
          */

        List<String> single = names.stream().flatMap(s->s.stream()).toList();
        System.out.println(single);

        List<String> word = Arrays.asList("LC_13_RomanToInteger");
        List<String>charas = word.stream().flatMap(w->Arrays.stream(w.split(""))).collect(Collectors.toList());
        System.out.println(charas);


            System.out.println("15. Students' course names - Print only courses containing \"a\".");
            List<List<String>> courses = Arrays.asList(
                    Arrays.asList("Java", "Spring"),
                    Arrays.asList("Python", "Django"),
                    Arrays.asList("React", "Angular")
            );

            List<String>result15 = courses.stream().flatMap(Collection::stream).filter(s->s.contains("a")).toList();
            //List<String>result15 = courses.stream().flatMap(n->n.stream()).filter(s->s.contains("a")).collect(Collectors.toList());
            result15.forEach(System.out::println);

            System.out.println("16. Departments and employees");
            List<List<String>> employees = Arrays.asList(
                    Arrays.asList("Sai", "Ravi"),
                    Arrays.asList("John", "Suresh"),
                    Arrays.asList("Kumar", "Anil")
            );

            List<String> result16 = employees.stream().flatMap(Collection::stream).
                    map(emp->"Employee : " + emp).collect(Collectors.toList());
            result16.forEach(System.out::println);

            System.out.println("Do the following:\n" +
                    "\n" +
                    "Flatten the lists\n" +
                    "Select even numbers\n" +
                    "Double them\n" +
                    "Print them");
            List<List<Integer>> numbers = Arrays.asList(
                    Arrays.asList(10, 15, 20),
                    Arrays.asList(25, 30, 35),
                    Arrays.asList(40, 45, 50)
            );

             numbers.stream().flatMap(Collection::stream).filter(n->n%2==0).map(n1->n1*2).forEach(System.out::println);

            System.out.println("18. Flatten → filter names → uppercase Flatten\n" +
                    "Keep names starting with \"s\"\n" +
                    "Convert to uppercase\n" +
                    "Print");
            List<List<String>> names18 = Arrays.asList(
                    Arrays.asList("sai", "ravi", "suresh"),
                    Arrays.asList("john", "sanjay", "kumar"),
                    Arrays.asList("sunil", "anil")
            );

            names18.stream().flatMap(n->n.stream()).filter(s->s.startsWith("s")).map(String::toUpperCase).forEach(System.out::println);


            System.out.println("Split every sentence into words\n" +
                    "Flatten all words\n" +
                    "Convert every word to uppercase\n" +
                    "Print");

            List<String> sentences = Arrays.asList(
                    "java spring boot",
                    "microservices docker",
                    "mysql aws"
            );

            sentences.stream().flatMap(n-> Arrays.stream(n.split(" "))).map(String::toUpperCase).forEach(System.out::println);

            System.out.println("Split into words\n" +
                    "Flatten\n" +
                    "Keep words whose length is greater than 4\n" +
                    "Convert to uppercase\n" +
                    "Print");
            List<String> sentences20 = Arrays.asList(
                    "java spring boot",
                    "microservices docker",
                    "mysql aws"
            );

            sentences20.stream().flatMap(n->Arrays.stream(n.split(" "))).filter(n1->n1.length()>4).map(String::toUpperCase).forEach(System.out::println);


            List<List<List<String>>> company = Arrays.asList(
                    Arrays.asList(
                            Arrays.asList("Sai", "Ravi"),
                            Arrays.asList("John", "David")
                    ),
                    Arrays.asList(
                            Arrays.asList("Kumar", "Anil"),
                            Arrays.asList("Suresh", "Sunil")
                    )
            );
            company.stream().flatMap(n->n.stream()).flatMap(n->n.stream()).forEach(System.out::println);

            System.out.println("Flatten the lists\n" +
                    "Select names starting with \"s\"\n" +
                    "Convert them to uppercase\n" +
                    "Add \"Developer: \" before each name\n" +
                    "Print");
            List<List<String>> employees1 = Arrays.asList(
                    Arrays.asList("saikumar", "ravi", "anil"),
                    Arrays.asList("suresh", "john", "sanjay"),
                    Arrays.asList("sunil", "kumar", "david")
            );
            employees1.stream().flatMap(n->n.stream()).filter(s->s.startsWith("s")).map(String::toUpperCase).map(n1->"Developer : " + n1).forEach(System.out::println);
        }
}
