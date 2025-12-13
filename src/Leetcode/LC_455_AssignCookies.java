package Leetcode;

import java.util.Arrays;

public class LC_455_AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        //if (g.length == 0 || s.length == 0) return 0;

        Arrays.sort(g); // Sort greed
        Arrays.sort(s); // Sort cookie sizes

        int left = 0; // pointer for g (children)
        int right = 0; // pointer for s (cookies)

        while (left < g.length && right < s.length) {
            if (g[left] <= s[right]) {
                left++; // child is content
            }
            right++; // try next cookie regardless
        }

        return left; // Number of content children
    }
    public static void main(String[] args) {
       int[] g = {1,2,3};
       int[] s = {1,1};
        System.out.println(findContentChildren(g,s));
    }
}

//https://leetcode.com/problems/assign-cookies/submissions/1640395668