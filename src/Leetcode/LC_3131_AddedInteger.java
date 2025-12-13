package Leetcode;

import java.util.Arrays;

public class LC_3131_AddedInteger {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }
}
//https://leetcode.com/problems/find-the-integer-added-to-array-i/submissions/1684119562
