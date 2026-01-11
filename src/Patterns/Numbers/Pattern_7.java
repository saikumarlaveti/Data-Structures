package Patterns.Numbers;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : " );
        int value = sc.nextInt();
        for(int i = 1;i<=value;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for(int k= value-1;k>0;k--){
            for(int l = 1; l <=k;l++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
