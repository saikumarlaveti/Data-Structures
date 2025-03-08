import java.util.Arrays;
import java.util.Stack;

class Solution {
            public boolean isValid(String s) {
                Stack<Character> stack = new Stack<Character>();
                for (char c : s.toCharArray()) {
                    if (c == '(')
                        stack.push(')');
                    else if (c == '{')
                        stack.push('}');
                    else if (c == '[')
                        stack.push(']');
                    else if (stack.isEmpty() || stack.pop() != c)
                        return false;
                }
                return stack.isEmpty();
            }
        
    public static void main(String[] args) {
        //String s = "([{}";
        //String s1 = "(])";
        String s2 = "()[]{}";
        Solution ss = new Solution();
        //System.out.println(ss.isValid(s));
        //System.out.println(ss.isValid(s1));
        System.out.println(ss.isValid(s2));
    }
}
       





//-----------------------------------------------------
