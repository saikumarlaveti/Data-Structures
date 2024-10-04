package Stack.Problems;

import java.util.Stack;

public class PushButtomOfTheStack {

    public void buttomOfTheStack(Stack<Integer> s,int data)
    {
        if(s.isEmpty()){
            s.push(data);
        }
        else {
            int element = s.pop();
            buttomOfTheStack(s,data);
            s.push(element);


        }
    }

    public void display(Stack<Integer>s)
    {
        while(! s.isEmpty())
        {
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PushButtomOfTheStack pbot = new PushButtomOfTheStack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pbot.buttomOfTheStack(s,4);
        System.out.println("After Inserted");
        pbot.display(s);

    }
}
