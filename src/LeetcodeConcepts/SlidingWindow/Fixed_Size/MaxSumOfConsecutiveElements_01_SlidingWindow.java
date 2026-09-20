package LeetcodeConcepts.SlidingWindow.Fixed_Size;

public class MaxSumOfConsecutiveElements_01_SlidingWindow {
    public static int MaximumSumOfKConsecutiveElements(int[]arr,int k){
        int sum = 0;
       int max = 0;
       for(int i = 0;i<k;i++){
           sum += arr[i];
       }
       for(int i = k ;i<arr.length;i++){
           sum = sum - arr[i-k]+arr[i];
           max = Math.max(sum,max);
       }
       return max;

    }

    public static void main(String[] args) {
       int result =  MaximumSumOfKConsecutiveElements(new int[]{1,2,3,4,5},3);
        System.out.println(result);
    }
}
