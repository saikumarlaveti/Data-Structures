package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC_350_IntersectionOfTwoArray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> number = new HashSet<>();
        for(int i:nums2){
            number.add(i);
        }
        for(int j:nums1) {
            if (number.contains(j)){
                result.add(j);
            }}
            int[] arrResult = new int[result.size()];
            for(int k = 0;k<result.size();k++){
                arrResult[k] = result.get(k);
        }
        return arrResult;
    }
    //method
    public static int[] intersect1(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] flag = new boolean[nums2.length];
        for(int i =0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++) {
                if (!flag[j]) {
                    if (nums1[i] == nums2[j]) {
                            result.add(nums1[i]);
                            flag[j] = true;
                    }
                }
            }
        }
        int[] arrResult = new int[result.size()];
        for(int k = 0;k<result.size();k++){
            arrResult[k] = result.get(k);
        }
        return arrResult;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};
        int[] result = intersect1(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
