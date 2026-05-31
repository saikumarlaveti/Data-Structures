package List.Stack.Problems;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray_04 {

    public static void reverseArray(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for(int element:arr){
            stack.push(element);
        }

        for(int i = 0;i<arr.length;i++){
            arr[i] = stack.pop();
        }
        Arrays.stream(arr).forEach(System.out::println);   // 5 4 3 2 1
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
    }
}
