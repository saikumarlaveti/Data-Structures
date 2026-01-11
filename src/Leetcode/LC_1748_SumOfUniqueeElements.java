package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LC_1748_SumOfUniqueeElements {
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        HashSet<Integer> sumOf = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(sumOf.contains(nums[i])){
                sum -= nums[i];
            }
            else {
                sumOf.add(nums[i]);
                sum += nums[i];
            }
        }
        return  sum;
    }

    public static int sumOfUnique_01(int[] nums) {
        int sum = 0;
        HashMap<Integer,Integer> unique = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(unique.containsKey(nums[i])){
                int value = unique.get(nums[i]);
                unique.put(nums[i],++value);
            }
        }




        return  sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(sumOfUnique(arr));
    }
}
