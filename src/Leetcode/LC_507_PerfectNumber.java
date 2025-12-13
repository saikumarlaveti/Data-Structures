package Leetcode;

public class LC_507_PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum == num;
    }

    public boolean checkPerfectNumber1(int num) {
        if (num % 2 == 1) return false;
        int sum = 0;
        for (int i = num / 2; i >= 1; i--) {
            if (num % i == 0) {
                sum += i;
            }
            if (num < sum) {
                return false;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        LC_507_PerfectNumber pn = new LC_507_PerfectNumber();
        System.out.println(pn.checkPerfectNumber(28));
        System.out.println(pn.checkPerfectNumber1(28));
    }
}