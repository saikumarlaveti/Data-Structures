package Leetcode;

import java.util.Arrays;

public class LC_1051_HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] original = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] - original[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        System.out.println(heightChecker(arr)); // 5
        int[] brr = {1,1,4,2,1,3,};
        System.out.println(heightChecker(brr));  //3
        int[] crr = {1,2,3,4,5};
        System.out.println(heightChecker(crr));  // 0
    }
}
