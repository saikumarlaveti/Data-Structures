package LeetcodeConcepts.PrefixSum;

import java.util.Arrays;

class TotalSum{
public static int[] TotalSum(int[] nums) {
    int result[] = new int[nums.length];
    result[0] = nums[0];
    for(int i = 1;i<nums.length;i++){
        result[i] = nums[i] + result[i-1];
    }
    return result;
}
public static void main(String[] args) {
    int[] nums = {6,9,14,5,3,8,7,12,13,1};
    System.out.println(Arrays.toString(TotalSum(nums)));
    String name = "LC_13_RomanToInteger";
}
}