package Leetcode;

public class LC_1572_DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat.length;j++){
                if(i == j){
                    sum += mat[i][j];
                }
                if(i+j == mat.length-1 && i!=j ){
                    sum += mat[i][j];
                }
            }
        }return sum;
    }

    public static void main(String[] args) {
        
    }
}
