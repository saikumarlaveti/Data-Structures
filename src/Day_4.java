public class Day_4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int brr[][] = {{1,2,3},{4,5,6}};
        for(int i = 0;i<brr.length;i++){
            for(int j = 0;j<=brr.length;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
