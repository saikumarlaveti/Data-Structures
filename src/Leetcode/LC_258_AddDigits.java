package Leetcode;

public class LC_258_AddDigits {
    public int addDigits(int num) {
        if(num <= 9) return num;
        int sum = 0;
        while(num>9){
            sum = 0;
            while(num>0){
                int digit = num%10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        LC_258_AddDigits ad = new LC_258_AddDigits();
        System.out.println(ad.addDigits(38));
        System.out.println(ad.addDigits(9));
        System.out.println(ad.addDigits(0));
    }
}
