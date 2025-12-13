package Leetcode;

public class LC_2643_RowAndMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[2];
        for(int i = 0;i<mat.length;i++){
            int one = 0;
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    one++;
                }
            }
            if(one>arr[1]){
                arr[0] = i;
                arr[1] = one;
            }
        }
        return arr;
    }
}
//https://leetcode.com/problems/row-with-maximum-ones/submissions/1680065316
//method - 2
/*
 public int[] rowAndMaximumOnes(int[][] mat) {
        int sum=0,maxone=-1,minind=mat.length;
        for(int i=0;i<mat.length;i++){
            sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
            if(sum>maxone) {
                maxone=sum;
                minind=i;
            }
        }
        return new int[]{minind,maxone};
    }
 */