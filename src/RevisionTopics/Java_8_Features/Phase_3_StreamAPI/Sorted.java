package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,1,8,4,1);
        list.stream().sorted().forEach(System.out::println);

        List<String> names = Arrays.asList("saikumar","abhi","naveen");
        List<String>sortResult = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortResult);  //[abhi, naveen, saikumar]
    }
}
