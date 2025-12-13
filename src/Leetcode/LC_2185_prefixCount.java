package Leetcode;

public class LC_2185_prefixCount {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        int variable = 0;
        for (int i = 0; i < words.length; i++) {
            variable = 0;
            String name = words[i];
            for (int j = 0; j < pref.length(); j++) {
                if (pref.charAt(j) == name.charAt(j)) {
                    variable++;
                } else {
                    break;
                }
                if (variable == pref.length()) {
                    count++;
                }
            }

        }return count;
    }

    public static int prefixCount1(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String name = words[i];
            if (name.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pre = "at";
        System.out.println(prefixCount(words,pre));
        System.out.println(prefixCount1(words,pre));
    }
}
//https://leetcode.com/problems/counting-words-with-a-given-prefix/submissions/1686405305