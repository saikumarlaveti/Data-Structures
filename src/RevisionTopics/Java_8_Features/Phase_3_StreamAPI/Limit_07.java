package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Limit_07 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream().limit(3).forEach(System.out::println); //1,2,3

        List<String> names = Arrays.asList("Saikumar","Santosh","Naveen","Naresh");
        names.stream().limit(2).forEach(System.out::println); //Saikumar , Santosh
    }
}
