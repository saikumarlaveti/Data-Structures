package Leetcode;

public class LC_2413_SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        return n%2==0?n:n*2;
    }

    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(6));
        System.out.println(smallestEvenMultiple(5));
    }
}
