package Leetcode;

public class LC_2119_NumberAfterDoubleReverse {
    public static int reverseMethod(int num){
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = (10 * rev) + digit;
            num /= 10;
        }
        return rev;
    }
    public static boolean isSameAfterReversals(int num) {
        int original = num;
        int a = reverseMethod(num);
        System.out.println(a);
        int second = reverseMethod(a);
        System.out.println(second);
        return original==second;
    }

    public static boolean isSameAfterReversals1(int num) {
        return num == 0 || num % 10 != 0;
    }
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
        System.out.println(isSameAfterReversals(1800));

        System.out.println(isSameAfterReversals1(526));
        System.out.println(isSameAfterReversals1(1800));
    }
}
