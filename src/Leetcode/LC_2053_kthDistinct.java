package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LC_2053_kthDistinct {
    public static String kthDistinct(String[] arr, int k) {
        Set<String> characters = new HashSet<>();
        ArrayList<String> Distinct = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            if(characters.contains(arr[i])){
                Distinct.add(arr[i]);
            }
            else{
                characters.add(arr[i]);
            }
        }
        System.out.println(Distinct);
        return Distinct.get(k - 1);
    }
    public static void main(String[] args) {
      String[] arr = {"d","b","c","b","c","a"};
      int k = 2;
        System.out.println(kthDistinct(arr,k));
    }
}
