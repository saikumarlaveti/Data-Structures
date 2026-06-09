package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst_12 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> result= nums.stream().filter(n->n%2==0).findFirst();
        System.out.println(result.get());

        List<String> names =Arrays.asList("Anil","Hema","Sai","Santosh");
        Optional<String> result1 =  names.stream().filter(name -> name.startsWith("S")).findFirst();

        System.out.println(result1.get());
    }
}
