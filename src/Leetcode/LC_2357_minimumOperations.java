package Leetcode;

import java.util.HashSet;

public class LC_2357_minimumOperations {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i] !=0){
                arr.add(nums[i]);
            }
        }
        return arr.size();
    }
    public static void main(String[] args) {

    }
}
