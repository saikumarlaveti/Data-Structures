package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Peek_09 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.stream().peek(num-> System.out.println("Before : "+num)).map(n->n*2).forEach(System.out::println);


        List<String> names = Arrays.asList("Saikumar","Santosh","Naveen","Naresh");
        names.stream()
                .peek(name -> System.out.println("Processing: " + name))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
