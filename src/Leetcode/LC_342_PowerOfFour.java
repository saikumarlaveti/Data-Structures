package Leetcode;

public class LC_342_PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        while(n%4==0){
            n /= 4;
        }
        return n==1;
    }
    public boolean isPowerOfFour1(int n) {
        if (n == 1) return true;  // Base case: 1 is a power of 4 (4^0 = 1)
        if (n <= 0 || n % 4 != 0) return false;  // Negative numbers, 0, and non-divisible cases

        return isPowerOfFour(n / 4);
    }
    public static void main(String[] args) {
        LC_342_PowerOfFour pof = new LC_342_PowerOfFour();
        System.out.println(pof.isPowerOfFour(16));
        System.out.println(pof.isPowerOfFour(256));
        System.out.println(pof.isPowerOfFour(8));
        System.out.println(pof.isPowerOfFour1(16));

    }
}
