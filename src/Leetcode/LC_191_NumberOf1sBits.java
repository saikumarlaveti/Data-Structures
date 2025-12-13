package Leetcode;

public class LC_191_NumberOf1sBits {
    public static int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            if((n&1) == 1)
                count ++;
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(10));
    }
}
