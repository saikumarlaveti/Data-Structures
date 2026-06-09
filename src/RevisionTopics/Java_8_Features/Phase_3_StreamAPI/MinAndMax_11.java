package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinAndMax_11 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,7,8,3,4);

        // public int compareTo(Integer anotherInteger) {
        //        return compare(this.value, anotherInteger.value);
        //    }
        Optional<Integer> min = num.stream().min(Integer::compareTo);
        System.out.println(min.get());

        Optional<Integer> max = num.stream().max(Integer::compareTo);
        System.out.println(max.get());


    }
}
