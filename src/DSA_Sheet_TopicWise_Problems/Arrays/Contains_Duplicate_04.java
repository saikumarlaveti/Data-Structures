package DSA_Sheet_TopicWise_Problems.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_04 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumber = new HashSet<>();
        for(int number :nums){
            if(!uniqueNumber.add(number)){
                    return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
   //     System.out.println(containsDuplicate(arr));
        Set<Integer> num = new HashSet<>();
        System.out.println(num.add(1));  //true
        System.out.println(num.add(1));  //false
    }
}
