package RevisionTopics.Java_8_Features.Phase_3_StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Any_14 {
    public static void main(String[] args) {
        //1.anyMatch( )
        List<Integer> numbers =  Arrays.asList(1,3,5,8,9);
        boolean result = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(result); //true because fo 8

        List<Integer> number = Arrays.asList(1,3,5,7);
        boolean result1 = number.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(result1); // false because there is no even numbers

        //2.allMatch( )
        List<Integer> number1 = Arrays.asList(2,4,6,8);
        boolean result2 = number1.stream().allMatch(n -> n % 2 == 0);
        System.out.println(result2);  // true because of all are even numbers

        List<Integer> numbers2 = Arrays.asList(2,4,5,8);
        boolean result3 = numbers2.stream().allMatch(n -> n % 2 == 0);
        System.out.println(result3);  // false because of 5 is odd number

        //3.noneMatch( )
        List<Integer> numbers4 = Arrays.asList(1,3,5,7);
        boolean result4 = numbers4.stream().noneMatch(n -> n % 2 == 0);
        System.out.println(result4);  // true all elements are not matching the condition


        List<Integer> number5 = Arrays.asList(1,3,4,7);
        boolean result5 = number5.stream().noneMatch(n -> n % 2 == 0);
        System.out.println(result5); //false 4 is even number
    }
}
