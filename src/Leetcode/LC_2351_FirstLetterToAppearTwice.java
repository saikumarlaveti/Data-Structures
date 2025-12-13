package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC_2351_FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return '0';
    }
    public static void main(String[] args) {
        LC_2351_FirstLetterToAppearTwice d = new LC_2351_FirstLetterToAppearTwice();
        String name = "abcbacz";
        System.out.println(d.repeatedCharacter(name));
    }
}

//https://leetcode.com/problems/first-letter-to-appear-twice/submissions/1702677456