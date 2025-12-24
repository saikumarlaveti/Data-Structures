package Leetcode;

public class LC_496_NextGreaterElement {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int l = nums1.length;
            int[] result = new int[l];
            for(int i = 0;i<l;i++){
                boolean flag = true;
                for(int j = 0;j<nums2.length;j++){
                    if(nums1[i] == nums2[j]){
                        int temp = j;
                        while(j<nums2.length &&  temp < nums2.length ){
                            if(nums2[j]<nums2[temp]){
                                result[i] = nums2[temp];
                                flag = false;
                                break;
                            }
                            temp++;
                        }
                    }
                }
                if(flag)
                    result[i] = -1;
            }
            return result;
        }
    }

    public static void main(String[] args) {
   
    }
}
