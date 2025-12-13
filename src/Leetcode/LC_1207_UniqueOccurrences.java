package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LC_1207_UniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            int var = arr[i];
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(var,value+1);
            }
            else{
                map.put(var,1);
            }
        }
      //  System.out.println(map);
        for (Integer value1 : map.values()) {
         if(!set.contains(value1)){
                  set.add(value1);
         }
         else{
             return false;
         }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,1,1,3};
        int[] arr = {1,2};
       System.out.println(uniqueOccurrences(arr));
        System.out.println(uniqueOccurrences(a));

    }
}
