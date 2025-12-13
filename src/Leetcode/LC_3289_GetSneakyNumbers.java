package Leetcode;

import java.util.Arrays;

public class LC_3289_GetSneakyNumbers {
    public static int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int index = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1] ){
                result[index++] = nums[i];
                i += 1;
            }
        }
        return result;
    }
    public static int[] getSneakyNumbers1(int[] nums) {
        int[] result = new int[2];
        int index = 0;
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++) {
                if (nums[i] == nums[j])
                    result[index++] = nums[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0};
        System.out.println(Arrays.toString(getSneakyNumbers(arr)));
        System.out.println(Arrays.toString(getSneakyNumbers1(arr)));
    }
}
