package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Parallel_Streams;

import java.util.Arrays;
import java.util.List;

public class ParraelStreams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Using Sequenial Stream");
        nums.stream().forEach(System.out::println);
        System.out.println("Using Parallel Stream");
        nums.parallelStream().forEach(System.out::println);
    }
}
