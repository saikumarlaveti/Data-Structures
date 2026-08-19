package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LC_15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> triple = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    if(nums[i] + nums[j]+nums[k] ==0){
                        triple.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return new ArrayList<>(triple);
    }

    //method - 2

    public static List<List<Integer>> threeSum_02(int[] nums) {
        HashSet<List<Integer>> triple = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
         int left = i+1;
         int right = nums.length-1;
         while(left<right){
             int sum = nums[i]+nums[left]+nums[right] ;
             if(sum == 0){
                 triple.add(Arrays.asList(nums[i],nums[left],nums[right]));
             }
             else  if(sum<0){
                 left++;
             }
             else{
                 right--;
             }
         }
        }
        return new ArrayList<>(triple);
    }
    public static void main(String[] args) {
        int[]arr = {-1,0,1,2,-1,-4};
        List<List<Integer>>trigle = threeSum(arr);
        System.out.println(trigle);
    }
}
