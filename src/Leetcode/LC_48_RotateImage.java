package Leetcode;


public class LC_48_RotateImage {
    public static void rotate(int[][] original) {
        print(original);
        System.out.println("---------------------------------");
        int[][] duplicate = new int[original.length][original.length];
        int length = original.length-1;
        for(int i = 0; i< original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                duplicate[j][length] = original[i][j];
            }
            length--;
        }
// copy to duplicate to original
        for(int i = 0; i< original.length; i++){
            for(int j = 0; j< original.length; j++){
                original[i][j] = duplicate[i][j];
            }
            length--;
        }
        print(original);
        System.out.println("---------------------------------");
        print(duplicate);
        }

    public static void print(int[][] original){
        for(int i = 0; i< original.length; i++){
            for(int j = 0; j< original.length; j++){
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mar = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mar);
    }
}
