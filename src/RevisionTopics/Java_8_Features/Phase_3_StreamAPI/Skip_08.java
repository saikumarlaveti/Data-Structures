package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Skip_08 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream().skip(3).forEach(System.out::println); //4,5,6,7,8,9,10

        List<String> names = Arrays.asList("LC_13_RomanToInteger","Santosh","Naveen","Naresh");
        names.stream().skip(2).forEach(System.out::println); //Naveen , Naresh
    }
}
