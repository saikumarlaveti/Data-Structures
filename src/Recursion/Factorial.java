package Recursion;

public class Factorial {
    public static int findFactorial(int n)
    {
        if(n==0 ){
            return 1;
        }
        else {

            return n*findFactorial(n-1);
        }
    }
    public static int sumNaturalNumber(int n){
        if(n==1)
            return 1;

        else
          return   n + sumNaturalNumber(n-1);

    }
    public static void main(String[] args) {
        System.out.println(Factorial.findFactorial(5));
        System.out.println(Factorial.sumNaturalNumber(5));
    }
}
