package Patterns.Numbers;

public class Pattern_15 {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1;

        int[][] arr = new int[rows][rows];

        // Step 1: Fill column-wise
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows; j++) {
                arr[j][i] = num++;
            }
        }

        // Step 2: Print row-wise
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print(arr[k][l] + "   ");
            }
            System.out.println();
        }
    }
}
