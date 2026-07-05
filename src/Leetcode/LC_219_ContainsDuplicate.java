package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC_219_ContainsDuplicate {

    //brute-force algorithm
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j< nums.length;j++){
                if(nums[i] == nums[j] && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }

    //using map
    public static boolean containsNearbyDuplicate_02(int[] nums, int k) {
        Map<Integer,Integer> number = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(number.containsKey(nums[i])){
                int previousIndex = number.get(nums[i]);
                if(Math.abs(previousIndex-i) <= k){
                        return true;
                }
            }
            //update the latest index
            number.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        //int[] arr = {1,2,3,1};
        int[] arr = {99,99};
        System.out.println(containsNearbyDuplicate_02(arr,3));
    }
}
