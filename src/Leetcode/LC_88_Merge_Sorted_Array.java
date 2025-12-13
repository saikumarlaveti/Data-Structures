package Leetcode;

import java.util.Arrays;

public class LC_88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for(int i = m;i<nums1.length;i++){
                nums1[i] = nums2[index++];
            }
        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
            LC_88_Merge_Sorted_Array msa = new LC_88_Merge_Sorted_Array();
            int [] nums1 = {1,2,3,0,0,0};
            int m = 3;
            int[] nums2 = {2,5,6};
            int n = 3;
            msa.merge(nums1,m,nums2,n);
    }
}
