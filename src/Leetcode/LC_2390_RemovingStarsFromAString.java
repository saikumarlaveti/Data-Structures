package Leetcode;

import java.util.Stack;

public class LC_2390_RemovingStarsFromAString {
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty())
            result.append(stack.pop());
        return result.reverse().toString();
    }
    public static void main(String[] args) {
       String s = "leet**cod*e";
        System.out.println(removeStars(s));  // lecoe

    }
}
