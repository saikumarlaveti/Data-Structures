package Leetcode;

public class LC_2956_findIntersectionValues {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] arr = new int[2];
        int count  = 0;
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    count++;
                    break;
                }
            }
        }
        arr[0] = count;
        count = 0;
        for(int j = 0;j<nums2.length;j++){
            for(int i = 0;i<nums1.length;i++){
                if(nums2[j] == nums1[i]){
                    count++;break;
                }
            }
        }
        arr[1] = count ;

        return arr;
    }

}
//https://leetcode.com/problems/find-common-elements-between-two-arrays/submissions/1676378684