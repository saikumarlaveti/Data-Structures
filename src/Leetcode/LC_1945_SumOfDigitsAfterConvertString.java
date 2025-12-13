package Leetcode;

public class LC_1945_SumOfDigitsAfterConvertString {
    public static int getLucky(String s, int k) {
        StringBuilder sum = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 96;
            sum.append(val);
        }

        int lucky = 0;
        for (int i = 0; i < sum.length(); i++) {
            lucky += sum.charAt(i) - '0';
        }

        k--;

        while (k-- > 0) {
            int total = 0;
            while (lucky > 0) {
                total += lucky % 10;
                lucky /= 10;
            }
            lucky = total;
        }

        return lucky;
    }

    public static void main(String[] args) {
        System.out.println(getLucky("iiii",1));  // 36
        System.out.println(getLucky("zbax",2)); //8
        System.out.println(getLucky("leetcode",2)); //6
    }
}
