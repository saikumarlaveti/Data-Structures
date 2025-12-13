package Leetcode;

public class LC_832_FlippingAnImage {
    public  static int[][] flipAndInvertImage(int[][] image) {
        int[][] duplicate = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            int k = -1;
            for (int j = image.length - 1; j >= 0; j--) {
                duplicate[i][++k] = image[i][j];
            }
        }
        System.out.println("1>>>>>>>>>>>>>>>>>>");
        print(duplicate);
        for (int i = 0; i < duplicate.length; i++) {
            for (int j = 0; j < duplicate.length; j++) {
//                if (duplicate[i][j] == 1) {
//                    duplicate[i][j] = 0;
//                } else {
//                    duplicate[i][j] = 1;
//                }
                duplicate[i][j] = duplicate[i][j]==0?1:0;
            }
        }
        System.out.println("2>>>>>>>>>>>>>>>>>>");

        print(duplicate);
        return duplicate;
    }


        public static void print (int[][] original){
            for(int i = 0; i< original.length; i++){
                for(int j = 0; j< original.length; j++){
                    System.out.print(original[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("------------------------------------------");
        }

    public static void main(String[] args) {
    int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
    print(arr);
   int[][] result =  flipAndInvertImage(arr);
   print(result);

    }
}


