package Leetcode;

import java.util.Arrays;

public class LC_1979_GreatestCommonDivisorOfArray {

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length-1];
        int result = 0;
        if(large%small == 0)
            return small;
        else if(large%small != 0 ){
            while(small != 0){
                result = small;
                small = large%small;
                large = result;
            }
            return large;
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,9,10};
        System.out.println(findGCD(arr));
        int[] b  = {7,5,6,8,3};
        System.out.println(findGCD(b));
        int[] c = {3,3};
        System.out.println(findGCD(c));
        int[] d = {6,7,9};
        System.out.println(findGCD(d));
    }
}
