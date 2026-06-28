package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Count_10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,8,9,10);
        //odd numbers
        System.out.println(numbers.stream().filter(n->n%2==1).count());  // 4
        //Even numbers
       long result =  numbers.stream().filter(n->n%2==0).count();  //5
        System.out.println(result);

        List<String> names = Arrays.asList("LC_13_RomanToInteger","Santosh","Naveen","Naresh");
        Long result1 = names.stream().filter(n->n.startsWith("S")).count(); //2
        System.out.println(result1);

    }
}
