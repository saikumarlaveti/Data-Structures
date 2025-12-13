package Leetcode;

public class LC_2535_DifferentElementSumAndDigitSum {
    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        for(int i :nums){
            elementSum += i;
        }
        int digitSum = 0;
        for(int i :nums){
            int no = i;
            while(no > 0){
                int single = no%10;
                digitSum += single;
                no /=10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
    public static void main(String[] args) {
        int [] nums = {1,15,6,3};
        System.out.println(differenceOfSum(nums));   // 9
    }
}
