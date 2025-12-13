package Leetcode;

import java.util.Arrays;

public class LC_1470_ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(i%2==0){
                arr[i] = nums[j];
                j++;
            }
            else{
                arr[i] = nums[n];
                n++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] result = shuffle(nums,n);
        System.out.println(Arrays.toString(result));
    }
}
