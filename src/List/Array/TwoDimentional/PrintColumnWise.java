package List.Array.TwoDimentional;

public class PrintColumnWise {
    public static void matrixSum(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <arr.length; j++) {
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        matrixSum(arr);
    }
}
