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
    int[] nums = {10,4,8,3};  // [10, 14, 22, 25]
    System.out.println(Arrays.toString(TotalSum(nums)));
    String name = "Saikumar";
}
}