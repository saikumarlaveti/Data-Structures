package Patterns.Alphabets;

public class Q_alphabet {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((i == 2 && j != 1 && j != 7 ) || ( j == 2 && i != 1 && i != 7) || (j == 6 && i != 1 && i !=7 ) || (i == 6 && j != 1 && j != 7)||(i == 4 && j ==4) || (j == 5 && i == 5) ||(i == 7 && j == 7)) {
                    System.out.print("*" + " ");
                } else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
