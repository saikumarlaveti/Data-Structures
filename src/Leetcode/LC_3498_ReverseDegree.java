package Leetcode;

public class LC_3498_ReverseDegree {
    public static int reverseDegree(String s) {
        int product = 1;
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            int index = s.indexOf(s.charAt(i));
            index = i + 1;
            int a = s.charAt(i);
            int reverse = 122 - a+1;
            product = index *reverse;
            sum += product;

        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseDegree(s));
    }
}
/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
