package Leetcode;

public class LC_136_SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1)
               return nums[0];
        int[] arr = new int[30000];
        for(int i = 0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
            LC_136_SingleNumber sn = new LC_136_SingleNumber();
            int[] arr = {2,2,3};
            int[] brr = {4,1,2,1,2,4,5};
            System.out.println(sn.singleNumber(arr));
        System.out.println(sn.singleNumber(brr));
    }
}


