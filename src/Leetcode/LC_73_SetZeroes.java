package Leetcode;

import java.util.HashSet;

public class LC_73_SetZeroes {
    public static void setZeroes(int[][] matrix) {
        printMatrix(matrix);
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++) {
                if (zeroRows.contains(i) || zeroCols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
        printMatrix(matrix);
    }
    //print matrix
    public static void printMatrix(int[][] arr){
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0;j< arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }


    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] brr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] crr = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
//        System.out.println(arr[0].length);
//        int[][] brr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        System.out.println("row length : "  + brr.length);
//        System.out.println("column length : " + brr[0].length);
      //  printMatrix(arr);
        setZeroes(arr);
        //printMatrix(arr);
        setZeroes(brr);
        setZeroes(crr);


    }
}
