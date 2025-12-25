package List.Array.TwoDimentional;

public class TwoDimentionArray {
    public static void main(String[] args) {
        System.out.println("Creation method -1");
        //Creation method -1
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2]  = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        //print
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Creation method -2");
        //Creation method -2
        int[][] brr  = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0;i<brr.length;i++) {
            for (int j = 0; j < brr.length; j++) {
                    System.out.print(brr[i][j] + " ");
                }
                System.out.println();

        }

        //accessing elemets
        System.out.println("2nd row 2nd element "+arr[1][1]);
        System.out.println(arr.length);
        System.out.println("First row length -" + arr[0].length); //1st row
        System.out.println("second row length -" + arr[1].length); //2nd row
        System.out.println("third row length - " + arr[2].length); //3rd row
    }
}