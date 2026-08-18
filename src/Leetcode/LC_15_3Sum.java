package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LC_15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> triple = new HashSet<>();
        Arrays.sort(nums);
        int i = 0;
        int j = i+1;
        while(j<=nums.length) {
            int k = j+1;
            while (k < nums.length) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    triple.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    i++;j++;
                    k = j+1;
                }
                else{
                    k++;
                }
            }
            i++;
            j++;
        }
        return new ArrayList<>(triple);
    }
    public static void main(String[] args) {
        int[]arr = {-1,0,1,2,-1,-4};
        List<List<Integer>>trigle = threeSum(arr);
        System.out.println(trigle);
    }
}
