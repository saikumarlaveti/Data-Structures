package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny_13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> result =
                list.stream().filter(i->i%2==0)
                        .findAny();

        System.out.println(result.get());
    }
}
