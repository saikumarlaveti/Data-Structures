package Patterns.Numbers;

import java.util.Scanner;

public class Pattern_2 {
    public static void printPattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j = n;j>i;j--){
                System.out.print(" "+" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows : ");
        int n  = sc.nextInt();
        printPattern(n);


    }
}
