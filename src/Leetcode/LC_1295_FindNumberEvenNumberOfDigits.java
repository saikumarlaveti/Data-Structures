package Leetcode;

public class LC_1295_FindNumberEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            String val = String.valueOf(nums[i]);
            if(val.length() %2 == 0){
                count ++;
            }
        }
        return count;

    }
//Optimized Solution
    public int findNumbers1(int[] nums) {
        int result = 0;
        for (int number: nums) {
            if ((number > 9 && number < 100) || (number > 999 && number < 10000) || (number == 100000)) result++;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
