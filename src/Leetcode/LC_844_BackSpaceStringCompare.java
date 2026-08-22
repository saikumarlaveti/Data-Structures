package Leetcode;

import java.util.Stack;

public class LC_844_BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        String s1 = BackSpace(s);
        String t1 = BackSpace(t);
        return s1.equals(t1);

    }
    public static String BackSpace(String word){
        Stack<Character> name = new Stack<>();

        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) != '#'){
                name.push(word.charAt(i));
            }
            else{
                if(!name.isEmpty()) {
                    name.pop();
                }
            }
        }
        return name.toString();
    }
    public static void main(String[] args) {
      String s = "a##c";
      String t = "#a#c";
        System.out.println(backspaceCompare(s,t));
   //     System.out.println(BackSpace("ab#c"));
    }
}
