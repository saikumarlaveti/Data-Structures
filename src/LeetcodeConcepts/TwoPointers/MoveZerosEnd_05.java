package LeetcodeConcepts.TwoPointers;

import java.util.Arrays;

public class MoveZerosEnd_05 {
    public static int[] move(int[] arr){
      if(arr.length==1)
          return arr;
      else {
          int first = 0;
          int last = arr.length-1;
          while (first<last){
              if(arr[first] ==0 && arr[last] != 0){
                  int temp = arr[first];
                  arr[first] = arr[last];
                  arr[last] =  temp;
                  first++;
                  last--;
              }
              else if (arr[first] ==0 && arr[last] == 0) {
              last--;
              }
              else
                  first++;
          }
      }

      return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 0,8,0,2,70, 0,30, 0,40, 50};  //[10, 50, 8, 40, 2, 70, 30, 0, 0, 0, 0]
        System.out.println(Arrays.toString(move(arr)));
    }
}
