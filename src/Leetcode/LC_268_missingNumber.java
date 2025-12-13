package Leetcode;

public class LC_268_missingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;  // Total number of elements should be 'n'
        int expectedSum = (n * (n + 1)) / 2;  // Using sum formula
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;  // Missing number
    }

    public static void main(String[] args) {
        int[] a = {3,1};      // Expected Output: 2
        int[] b = {1};        // Expected Output: 0
        int[] c = {1,2,4};    // Expected Output: 3
        int[] d = {0,1,3};    // Expected Output: 2
        int[] e = {1};        // Expected Output: 0

        LC_268_missingNumber mn = new LC_268_missingNumber();
        System.out.println(mn.missingNumber(a));
        System.out.println(mn.missingNumber(b));
        System.out.println(mn.missingNumber(c));
        System.out.println(mn.missingNumber(d));
        System.out.println(mn.missingNumber(e));
    }
}
