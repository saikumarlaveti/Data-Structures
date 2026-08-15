package LeetcodeConcepts.TwoPointers;

public class isSubsequence_18 {
    public static boolean isSubsequence(String s, String t) {

        int left = 0;  // pointer for s
        int right = 0; // pointer for t

        while (left < s.length() && right < t.length()) {

            if (s.charAt(left) == t.charAt(right)) {
                left++;
            }

            right++;
        }

        return left == s.length();
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
