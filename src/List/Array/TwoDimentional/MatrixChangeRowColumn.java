package List.Array.TwoDimentional;

public class MatrixChangeRowColumn {
    public static void changeRowColumn(int[][] arr){
        int[][] brr = new int[arr.length][arr.length];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j< arr.length;j++){
                brr[i][j] = arr[j][i];
            }
        }
        printMatrix(brr);
    }

    public static void printMatrix(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before change");
        printMatrix(arr);
        System.out.println("After Change");
        changeRowColumn(arr);

    }
}
