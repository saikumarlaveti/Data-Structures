package List.Stack.Problems;

import java.util.Stack;

public class ReverseStack {
    public void pushButtomOfStack(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
        }
        else {
            int element = s.pop();
            pushButtomOfStack(s,data);
            s.push(element);
        }

    }
    public void reverseNumber(Stack<Integer> s)
    {

         if(s.isEmpty())
         {
    return;
         }
         else
         {
            int element = s.pop();
            reverseNumber(s);
            pushButtomOfStack(s,element);
         }
    }

    public static void main(String[] args) {
        ReverseStack rs = new ReverseStack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        rs.reverseNumber(s);
        while( !s.isEmpty())
        {
            System.out.print(s.pop()+" ");

        }

    }
}
