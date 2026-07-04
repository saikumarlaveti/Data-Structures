package DSA_Sheet_TopicWise_Problems.Arrays;

public class MaximumSubArray_03 {
    //failed some large amount of data
    public static void maximumSubArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j <arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
//kadane algorithm - suit for larges scale data
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        //int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {-2,1,-3,4};
        maximumSubArray(arr);
    }
}
