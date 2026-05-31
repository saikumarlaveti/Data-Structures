package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums.stream().map(n->n*2).forEach(System.out::println);

        List<String> names = Arrays.asList("Saikumar","Santosh","Naveen");
        System.out.println(names);
        names.stream().map(n->n.toUpperCase()).forEach(System.out::println);  //both are same output
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        names.stream().map(String::length).forEach(System.out::println);
        List<String> name = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<Integer> length = names.stream().map(String::length).toList();
        System.out.println(name);  //[SAIKUMAR, SANTOSH, NAVEEN]
        System.out.println(length);  // [8, 7, 6]
    }
}
