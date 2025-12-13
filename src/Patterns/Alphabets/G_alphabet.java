package Patterns.Alphabets;

public class G_alphabet {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((i == 1 && j != 1) ||(j == 1 && i != 1 && i != 6 && i != 7) ||(i == 6 && j == 1) || (i == 7 && j != 1 && j !=7 && j != 6) ||(i == 4 && j !=2)||(i == 5 && j == 4) ||(i == 6 && j == 5) ||(j == 7 && i != 2 && i != 3)) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
