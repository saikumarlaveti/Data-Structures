package Patterns.Alphabets;

public class W_alphabet {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 ||(i == 6 && j ==2 ) || (i == 5 && j ==3)||(i == 4 && j == 4)||(i == 5 && j == 5)||(i == 6 && j ==6)) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}