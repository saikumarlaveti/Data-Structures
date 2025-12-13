package Patterns.Alphabets;

public class S_alphabet {
    public static void main(String[] args) {
         for(int i = 1;i <= 7;i++){
             for(int j = 1;j <= 7 ;j++){
                 if((i == 1 && j != 1) || (i == 2 && j == 1)
                         ||(i ==3 && j == 1) ||
                         (i == 4 && j != 1 && j !=7) ||
                         (i == 5 && j ==7 )||
                         (i == 6 && j == 7) ||
                         (i == 7 && j != 7)){
                     System.out.print("*" + " ");
                 }
                 else{
                     System.out.print(" "+" ");
                 }
             }
             System.out.println();
         }
    }
}
