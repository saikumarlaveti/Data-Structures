package Leetcode;


public class LC_724_FindPivotIndex {
    public static int pivotIndex(int[] nums) {
            //find left sum
            int[] leftSum = new int[nums.length];
            for(int i = 1;i<nums.length;i++){
                leftSum[i] = leftSum[i-1] + nums[i-1];
            }
            //find right sum
            int[] rightSum = new int[nums.length];
            for(int i = nums.length-2;i>=0;i--){
                rightSum[i] = rightSum[i+1] + nums[i+1];
            }

            //return pivot index
            for(int i =0;i<nums.length;i++){
                if(leftSum[i] == rightSum[i]){
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
