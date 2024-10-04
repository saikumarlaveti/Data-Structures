package Stack.Problems;

import java.util.Stack;

public class Stackimpl {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("peek element-"+s.peek());
        System.out.println("pop element-"+s.pop());
        System.out.println("peek element-"+s.peek());

    }
}
