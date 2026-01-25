package Patterns.Numbers;

public class Pattern_12 {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            char ch = 'A';
            for(int j = 0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
             --ch;
            for(int k = 0;k<i;k++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
}
