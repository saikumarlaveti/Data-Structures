package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC_2089_FindIndicesAfterSorting {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> number = new ArrayList<>();

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+ right)/2;

            if(nums[mid] == target){
                number.add(mid);
                right = mid-1;
            } else if (target>nums[mid]) {
                left = mid+1;
            }
            else if (target<nums[mid]){
                right = mid-1;
            }

        }
         Collections.sort(number);
        return number;
    }
    public static void main(String[] args) {
    int[] nums ={1,2,5,2,3};
        System.out.println(targetIndices(nums,2));
    }
}
