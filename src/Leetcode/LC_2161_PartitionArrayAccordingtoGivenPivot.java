package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_2161_PartitionArrayAccordingtoGivenPivot {
    public  static int[] pivotArray(int[] nums, int pivot) {

        int n=nums.length;
        int i=0, j=n-1, left=0, right=n-1;
        int[] ans=new int[n];
        while(i<n){
            if(nums[i]<pivot){
                ans[left++]=nums[i];
            }
            if(nums[j]>pivot){
                ans[right--]=nums[j];
            }
            i++;j--;
        }
        while(left<=right){
            ans[left++]=pivot;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        int[] result = pivotArray(nums,pivot);
        System.out.println(Arrays.toString(result));
    }
}

