package Leetcode;

public class LC_3754_NonZeroDigits {
    public static long sumAndMultiply(int n) {
        int result = 0;
        int sum = 0;

        while(n!=0){
            int num = n%10;
            if(num != 0){
                sum += num;
                result = (result*10)+num;
            }
            n /= 10;
        }
        //reverse number
        int reverse = 0;
        while(result !=0){
            int res1 = result%10;
            reverse = (reverse*10)+res1;
            result /=10;
        }
    return (long) reverse * sum;

    }
    public static void main(String[] args) {
        System.out.println(sumAndMultiply(10203004));
    }
}
