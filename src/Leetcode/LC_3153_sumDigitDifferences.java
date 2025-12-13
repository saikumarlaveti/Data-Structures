package Leetcode;

public class LC_3153_sumDigitDifferences {
    public long sumDigitDifferences(int[] nums) {
        int n = nums.length;
        int length = String.valueOf(nums[0]).length();
        long total = 0;

        for (int pos = 0; pos < length; pos++) {
            int[] count = new int[10]; // digits 0-9

            for (int num : nums) {
                int digit = (num / (int)Math.pow(10, pos)) % 10;
                count[digit]++;
            }

            long pairs = 0;
            for (int c : count) {
                pairs += (long) c * (n - c);
            }
            total += pairs;
        }

        // Since each pair is counted twice (once for each direction), divide by 2
        return total / 2;
    }

}
//https://leetcode.com/problems/sum-of-digit-differences-of-all-pairs/submissions/1705588488