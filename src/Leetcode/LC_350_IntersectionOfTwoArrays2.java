package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LC_350_IntersectionOfTwoArrays2 {
    public static   int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int high = nums1.length>nums2.length?nums1.length:nums2.length;
        boolean[] check = new boolean[high];
        for(int i =0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j] && !check[i]  &&  nums1[i]>=nums2[j]) {
                    result.add(nums1[i]);
                    check[j] = true;
                    break;
                }
            }
        }
        int[] arr = new int[result.size()];
        for(int k = 0;k<result.size();k++){
            arr[k] = result.get(k);
        }
        System.out.println(result);
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));

    }
}
