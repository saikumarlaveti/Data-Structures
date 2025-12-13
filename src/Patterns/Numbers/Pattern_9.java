package Patterns.Numbers;

public class Pattern_9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = i; j <= 7; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}