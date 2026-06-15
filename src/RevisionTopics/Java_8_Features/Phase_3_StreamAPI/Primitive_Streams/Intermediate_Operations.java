package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.Primitive_Streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Intermediate_Operations {
    public static void main(String[] args) {
         // 1.filter() — Keep matching elements
        IntStream.rangeClosed(1,10).filter(n->n%2==0).forEach(System.out::println);  // 2 ,4,6,8,10

        //  2.map() — Transform each element
        IntStream.rangeClosed(1,5).map(n->n*n).forEach(System.out::println);  //1 4 9 16 25

        //  3.sorted() — Sort elements
        IntStream.of(5,4,3,1,7,0).sorted().forEach(System.out::println); //0 1 3 4 5 7

        //  4.distinct() — Remove duplicates
        IntStream.of(5,5,4,4,3,1,3,0).distinct().forEach(System.out::println); //5 4 3 1 0

        //  5.limit() — Take first N elements
        IntStream.of(1,2,3,4,5).limit(3).forEach(System.out::println); // 1 2 3

        //  6.skip() — Skip first N elements
        IntStream.of(1,2,3,4,5).skip(3).forEach(System.out::println); // 4 5

    }
}
