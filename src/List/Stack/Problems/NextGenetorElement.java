package List.Stack.Problems;

import java.util.Stack;

public class NextGenetorElement {

//    public void genetor(int[] arr)
//    {
//        int[] brr = new int[arr.length];
//        for(int i = 0;i<=arr.length;i++)
//        {
//            for(int j = i+1;j<arr.length;j++)
//            {
//                if(arr[i]<arr[j]){
//                    brr[i] = arr[j];
//                    break;
//                }
//                else {
//                    brr[i] = -1;
//                }
//            }
//
//        }
//      brr[arr.length-1] =-1;
//        for(int i :brr)
//        {
//            System.out.print(i+"  ");
//        }
//    }

    public void genetor(int[] arr)
    {
        Stack<Integer> s = new Stack<>();
        int[] nxt = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nxt[i] = -1;
            }
            else {
                nxt[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i :nxt)
        {
            System.out.print(i+"  ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        NextGenetorElement nge = new NextGenetorElement();
        nge.genetor(arr);

    }
}
