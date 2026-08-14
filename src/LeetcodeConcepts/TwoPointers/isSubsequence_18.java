package LeetcodeConcepts.TwoPointers;

public class isSubsequence_18 {
    public static boolean isSubsequence(String s, String t) {
        if(t.length()==1){
            return s.charAt(0) == t.charAt(0);
        }
        int left = 0;
    int right = 1;
    while(right<s.length()){
        if(!(t.indexOf(s.charAt(left))<=t.indexOf(s.charAt(right)))){
            return false;
        }
        else {
            left++;
            right++;
        }
    }
    return true;
    }
    public static void main(String[] args) {
        String s = "aza";
        String t = "abzba";
        System.out.println(isSubsequence(s,t));
    }
}
