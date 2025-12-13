package Leetcode;

public class LC_3099_HarshadNumber {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int original = x;
        int sum = 0;
        while(x>0){
            int digit = x%10;
            sum += digit;
            x /=10;
        }
        return original%sum==0?sum:-1;
    }

    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(18));
    }
}
