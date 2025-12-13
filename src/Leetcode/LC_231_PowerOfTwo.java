package Leetcode;

public class LC_231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while(n>2){
            if(n%2 != 0) return false;
            n = n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i = 0;i<=7;i++)
            System.out.print((int)Math.pow(2,i) + " ");
        LC_231_PowerOfTwo pot = new LC_231_PowerOfTwo();
        System.out.println(pot.isPowerOfTwo(1));
        System.out.println(pot.isPowerOfTwo(2));
        System.out.println(pot.isPowerOfTwo(4));
        System.out.println(pot.isPowerOfTwo(3));
        System.out.println(pot.isPowerOfTwo(0));
    }
}
