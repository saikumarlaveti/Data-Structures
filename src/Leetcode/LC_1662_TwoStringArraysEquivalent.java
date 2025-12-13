package Leetcode;

public class LC_1662_TwoStringArraysEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (String string : word1) sb.append(string);
        for (String string : word2) sb1.append(string);

        System.out.println(sb);
        System.out.println(sb1);
        return sb.compareTo(sb1)==0;
    }
    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));

        String[] word3 = {"abc", "d", "defg"};
        String[] word4 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word3,word4));

        String[] word5 = {"a", "cb"};
        String[] word6 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word5,word6));
     }
}
