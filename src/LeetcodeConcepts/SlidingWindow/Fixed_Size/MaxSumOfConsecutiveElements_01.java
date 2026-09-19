package LeetcodeConcepts.SlidingWindow.Fixed_Size;

public class MaxSumOfConsecutiveElements_01 {
    public static int MaximumSumOfKConsecutiveElements(int[]arr,int k){
        int sum = 0;
        int temp = 0;
        for(int i = 0;i<=arr.length-k;i++){
            temp = 0;
            for(int j = i;j<k+i;j++){
                temp += arr[j];
            }
            System.out.println(temp + "=="+ i);
            sum = Math.max(sum,temp);
        }
        return sum;
    }

    public static void main(String[] args) {
       int result =  MaximumSumOfKConsecutiveElements(new int[]{2,3,10,1,5,4},3);
        System.out.println(result);
    }
}
