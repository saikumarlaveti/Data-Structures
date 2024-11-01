package Time_Complexity;

public class Exponential {
    public int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        Exponential ex = new Exponential();
        System.out.println(ex.fib(5));
    }
}
