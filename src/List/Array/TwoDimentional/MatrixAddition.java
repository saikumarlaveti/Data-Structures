package List.Array.TwoDimentional;

public class MatrixAddition {
    public static void matrixSum(int[][] arr,int[][] brr){
        int[][] sum = new int[arr.length][arr.length];
        for(int i= 0;i< arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                sum[i][j] = arr[i][j]+brr[i][j];
            }
        }
        //matrix print
        for(int i= 0;i< arr.length;i++){
            for(int j = 0;j<arr.length;j++) {
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
            }
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][]brr = {{1,2,3},{4,5,6},{7,8,9}};
        matrixSum(arr,brr);
    }
}
