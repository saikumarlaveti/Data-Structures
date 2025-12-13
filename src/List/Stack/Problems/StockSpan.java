package List.Stack.Problems;

import java.util.Stack;

public class StockSpan {

    public static void stockSpanProblem(int[] Stock,int[] span)
    {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i = 1;i<span.length;i++)
        {
            int current = Stock[i];
             while( !s.isEmpty() && current>Stock[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                span[i] = i+1;
            }
            else {
                int preHigh = s.peek();
                span[i] = i-preHigh;
            }
            s.push(i);

        }


    }

    public static void main(String[] args) {
    int[] Stock  = {100,80,60,70,60,85,100};
    int[] span = new int[Stock.length];
    StockSpan.stockSpanProblem(Stock,span);
        System.out.println();
    for(int i = 0;i<span.length;i++)
    {
        System.out.print(span[i]+" ");
    }
    }
}
