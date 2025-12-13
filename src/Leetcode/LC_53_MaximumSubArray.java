package Leetcode;


public class LC_53_MaximumSubArray {
    public int maximumSubArray(int[] arr){
        int sum = 0,temp = 0;
        int n= arr.length;
        for(int i =0 ;i<n;i++){
            temp = 0;
            for(int j = i+1;j<n-1;j++){
                 temp += arr[j];
            }
            System.out.println("temp -" + temp);
            System.out.println("sum -" + sum);
            sum  = Math.max(sum,temp);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] brr = {5,4,-1,7,8};
        LC_53_MaximumSubArray msa = new LC_53_MaximumSubArray();
     //   System.out.println(msa.maximumSubArray(arr));
        System.out.println(msa.maximumSubArray(arr));

    }
}
