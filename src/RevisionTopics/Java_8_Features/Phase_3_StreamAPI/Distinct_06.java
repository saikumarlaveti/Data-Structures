package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Distinct_06 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,2,4,6,7,8,1);
        numbers.stream().distinct().forEach(System.out::println);

        List<String> names = Arrays.asList("LC_13_RomanToInteger","Santosh","LC_13_RomanToInteger","Naresh","Naresh");
        names.stream().distinct().forEach(System.out::println);
    }
}
