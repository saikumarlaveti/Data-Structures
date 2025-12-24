package Leetcode;

import java.util.Stack;

public class LC_682_BaseballGame {
    public static int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                s.pop();
            }
            else if (op.equals("D")) {
                s.push(s.peek() * 2);
            }
            else if (op.equals("+")) {
                int last = s.pop();
                int secondLast = s.peek();
                s.push(last);                // restore
                s.push(last + secondLast);  // add sum
            }
            else {
                // number (positive or negative)
                s.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        while (!s.isEmpty()) {
            total += s.pop();
        }
        return total;
    }
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        Integer.parseInt(ops[0]);
        System.out.println(calPoints(ops));
    }
}
