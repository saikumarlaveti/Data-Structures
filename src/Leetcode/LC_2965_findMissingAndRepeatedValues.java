package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC_2965_findMissingAndRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        int repeat = -1;

        int n = grid.length;
        int total = 0;

        // Find repeat number and calculate total sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                if (set.contains(val)) {
                    repeat = val;
                }
                set.add(val);
                total += val;
            }
        }

        int maxVal = n * n;
        int expectedSum = maxVal * (maxVal + 1) / 2;

        int missing = expectedSum - (total - repeat);

        result[0] = repeat;
        result[1] = missing;
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,2}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(arr)));   // [2, 4]
    }
}
