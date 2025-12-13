package Leetcode;

public class LC_371_SumOfTwoInteger {
    public static int getSum(int a, int b) {
        while(b != 0){
            int sumWithOutCarry = a^b;
            int sum = (a&b) <<1;
            a = sumWithOutCarry;
            b = sum;
        }
    return a;
    }
    public static void main(String[] args) {
        System.out.println(getSum(5,7));
        System.out.println(getSum(5,10));
    }
}
