package Leetcode;

public class LC_14_LongestCommon_Prefix {
    public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";

            // Take the first word as reference
            String prefix = strs[0];

            // Compare prefix with each string
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(prefix) != 0) {
                    // Reduce the prefix length by one
                    prefix = prefix.substring(0, prefix.length() - 1);
                    // If prefix becomes empty, no common prefix
                    if (prefix.isEmpty()) return "";
                }
            }
            return prefix;
        }


    public static void main(String[] args) {
        LC_14_LongestCommon_Prefix logest = new LC_14_LongestCommon_Prefix();
        String[] arr = {"dog","racecar","car"};
        System.out.println(logest.longestCommonPrefix(arr));
    }
}
