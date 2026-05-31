package List.Stack.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DeleteMiddleElement_08 {
    public static void deleteMiddleElement(Stack<Integer> nums){
        ArrayList<Integer> list = new ArrayList<>();
        //step 1 : adding elements stack to arraylist
        while(!nums.isEmpty()){
            list.add(nums.pop());
        }
        //step 2 : remove middle element
        int mid = list.size()/2;
         list.remove(mid);
        System.out.println();
        list.forEach(System.out::println);

        //step 3 : adding elements into stack
        for(int i :list){
            nums.push(i);
        }
        System.out.println("Printing statck elements");
        nums.forEach(System.out::println);
    }
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        nums.push(5);

        deleteMiddleElement(nums);
    }
}
