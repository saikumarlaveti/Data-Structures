package Leetcode;

public class LC_557_ReverserWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }

        return result.toString().trim(); // remove the trailing space
    }
    public static void main(String[] args) {
    String name = "Let's take LeetCode contest";  //s'teL ekat edoCteeL tsetnoc
        System.out.println(reverseWords(name));

    }
}
