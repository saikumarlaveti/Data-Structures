package Leetcode;

import java.util.Arrays;

public class LC_2485_FindPivotInteger {
    public static int pivotInteger(int n) {
        int totalSum = n*(n+1)/2;
        int leftSum = 0;

        for(int i = 1;i<=n;i++){
            leftSum += i;
            int rightSum = totalSum - leftSum +i;
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
}
