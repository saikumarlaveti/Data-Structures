package Leetcode;

public class LC_3232_canAliceWin {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<10)
                singleSum += nums[i];
            else
                doubleSum += nums[i];
        }
        if(singleSum == doubleSum)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {

    }
}
//https://leetcode.com/problems/find-if-digit-game-can-be-won/submissions/1678529275
