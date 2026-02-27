package LeetcodeConcepts.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate_13 {
    private static void remove(int[] arr) {
        int left = 0;
        int right = left+1;
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[left]);
        while(right<arr.length){
            if(arr[left] == arr[right]){
                right++;
                flag = true;
            }

            else if(arr[left] != arr[right] && flag){
                left = right;
                list.add(arr[left]);
                right++;
                flag = false;
            }
            else{
                left++;right++;
                list.add(arr[left]);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,4,5,6,7,7,8}; //[1, 2, 3, 4, 5, 6, 7, 8]
        remove(arr);
    }
}
