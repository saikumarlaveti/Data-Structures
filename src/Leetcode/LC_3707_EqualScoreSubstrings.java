package Leetcode;

import java.util.Arrays;

public class LC_3707_EqualScoreSubstrings {
    public static boolean scoreBalance(String s) {
        int left = 0;
        int right = s.length()-1;
        int leftSum = 0;
        int rightSum = 0;
        while(left<=right){
            if (leftSum <= rightSum) {
                leftSum += s.charAt(left) - '0' - 48;
                left++;
            }
            else {
                rightSum += s.charAt(right)-'0'-48;
                right--;
            }
        }
        return leftSum == rightSum;
    }
    public static void main(String[] args) {
        System.out.println(scoreBalance("aebaed"));
    }
}
