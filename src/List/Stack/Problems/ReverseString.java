package List.Stack.Problems;

import java.util.Stack;

public class ReverseString {
    public void reverseStack(String word)
    {
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<word.length();i++)
        {
            s.push(word.charAt(i));
        }

        StringBuilder sb  = new StringBuilder();
        while(!s.isEmpty()) {
            char c = s.pop();
            sb.append(c);
        }
        System.out.println(sb);
        word = sb.toString();
        System.out.println(word);
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String name = "Saikumar";
        rs.reverseStack(name);


    }
}
