package Patterns.Alphabets;

public class U_alphabet {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((j == 1 && i!=6 && i!=7 )||(j == 7 && i != 7) || ( i == 6 && j == 1) || ( i == 7 && j!=1 && j!=7 )) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}