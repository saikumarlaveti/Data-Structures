package RevisionTopics.Java_8_Features.Phase_3_StreamAPI.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean,List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(result.get(true));
        System.out.println(result.get(false));

        List<Integer> num = Arrays.asList(-5, 3, -1, 8, -4, 7, 2, -3);
        Map<Boolean, List<Integer>> posnNeg = num.stream()
                .collect(Collectors.partitioningBy(n -> n > 0));
        System.out.println(posnNeg.get(true));   // [3, 8, 7, 2]     → positive
        System.out.println(posnNeg.get(false));  // [-5, -1, -4, -3] → negative
    }
}
