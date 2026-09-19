package Leetcode;

public class LC_3870_CountCommasInRange {
    public int countCommas(int n) {
//        if(n<1000)
//            return 0;
//        else
//            return n - 1000 + 1;

        return n<1000?0:n-1000+1;
    }

    public static void main(String[] args) {
        int n = 1002;

    }
}
