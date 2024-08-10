import java.util.Scanner;

public class Sessions {
   static Scanner sc= new Scanner(System.in);
   public static void Session_1(){
       for(int i =1;i<=3;i++){
           for(int j = 0;j<(2*i)-1;j++){
               System.out.print("*"+" ");
           }
           System.out.println();
       }
   }

    public static void Session_2(){
        System.out.println("Enter row number");
        int n  = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      // Sessions.Session_1();
       Sessions.Session_2();
    }
}
