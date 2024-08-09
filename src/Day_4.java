import java.util.Scanner;

public class Day_4 {
    public static void fromScanner()
    {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int [2][3];
        System.out.println("Enter elements");
        for(int i =0;i<array.length;i++){
            for(int j =0;j<=array.length;j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i< array.length;i++){
            for(int j = 0;j<=array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int brr[][] = {{1,2,3},{4,5,6}};
        for(int i = 0;i<brr.length;i++){
            for(int j = 0;j<=brr.length;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        Day_4.fromScanner();
    }
}
