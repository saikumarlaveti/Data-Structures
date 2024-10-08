package Stack.Problems;

import java.util.Stack;

public class DuplicateParenthese {

    public boolean duplicate(String word) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(c == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                s.pop();  // Remove the opening parenthesis '('

                if(count < 1) {
                    return true;  // Duplicate parentheses
                }
            } else {
                s.push(c);  // Only push non-closing parenthesis characters
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String pare = "((a+b))";
        DuplicateParenthese dp = new DuplicateParenthese();
        System.out.println(dp.duplicate(pare));  // Should print true
    }
}
