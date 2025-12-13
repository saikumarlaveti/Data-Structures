package Patterns.Alphabets;

public class J_alphabet {
    public static void main(String[] args) {
        for(int i = 1;i<=7;i++){
            for(int j= 1;j<=7;j++){
                if(i == 1 || j == 4  || (i == 6 && j ==3) || (i == 5 && j ==2 )){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
