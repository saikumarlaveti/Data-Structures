package Leetcode;

public class LC_509_FibonacciNumber {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    public static void main(String[] args) {
            LC_509_FibonacciNumber fn = new LC_509_FibonacciNumber();
        System.out.println(fn.fib(2));
        System.out.println(fn.fib(3));
        System.out.println(fn.fib(4));

    }
}
