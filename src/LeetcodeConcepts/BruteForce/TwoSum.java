package LeetcodeConcepts.BruteForce;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
    int[] arr = {2,3,5,6};
        System.out.println(Arrays.toString(twoSum(arr,7)));
    }
}
