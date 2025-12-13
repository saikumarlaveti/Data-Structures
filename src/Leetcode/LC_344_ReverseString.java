package Leetcode;

public class LC_344_ReverseString {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length-1;
            while(left<right){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
            System.out.println(s);
        }

    public static void main(String[] args) {
        LC_344_ReverseString rs = new LC_344_ReverseString();
        char[] s = {'h','e','l','l','o'};
        rs.reverseString(s);
    }
}
