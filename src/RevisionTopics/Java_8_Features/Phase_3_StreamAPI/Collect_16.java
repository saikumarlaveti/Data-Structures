package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect_16 {
    public static void main(String[] args) {
       // 1. collect(Collectors.toList())
        List<String> nums = Arrays.asList("Saikumar","Santosh","Naresh","Naveen");
        List<String>upperCase = nums.stream().map(String::toUpperCase).toList();
        upperCase.stream().forEach(System.out::println);
    }
}
