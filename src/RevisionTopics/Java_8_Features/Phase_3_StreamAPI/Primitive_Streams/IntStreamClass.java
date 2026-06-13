package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Primitive_Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamClass {
    public static void main(String[] args) {
        //1.Integer stream
        System.out.println("Integer Stream");
        Stream<Integer> nums = Stream.of(1,2,3,4,5);
        nums.forEach(System.out::println);

        //2.int Stream
        System.out.println("int stream");
        IntStream numbers = IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);

        //1.IntStream.of()

    }
}
