package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_15 {
    public static void main(String[] args) {
        //sum
        List<Integer> num = Arrays.asList(1,2,3,4,5);
       Optional<Integer> result =  num.stream().reduce((a, b)->a+b);
        System.out.println(result.get());

        //sum
        int result1 =  num.stream().reduce(0,Integer::sum);
        System.out.println(result1);

        //Multiplication
        int result2 = num.stream().reduce(1,(a,b)->a*b);
        System.out.println(result2);

        //Find Max element
        int result3 = num.stream().reduce(0,Integer::max);
        System.out.println(result3);
        int result4 = num.stream().reduce(Integer.MAX_VALUE,Integer::min);
        System.out.println(result4);

        List<String> names =
                Arrays.asList("Java","Spring","Boot");

        String result5 = names.stream().reduce("",(a,b) -> a+b);
        System.out.println(result5);


    }
}
