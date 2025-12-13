package Leetcode;

public class LC_3190_MinimumOperations {
    public static int minimumOperations(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 3 == 0){
                count++;
            }
        }
        return nums.length-count;
    }
    public static int minimumOperations1(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0) continue;
            else{
                nums[i]++;
                if(nums[i]%3!=0){
                    nums[i]--;
                    nums[i]--;
                }
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(minimumOperations(arr));
        System.out.println(minimumOperations1(arr));
    }
}
