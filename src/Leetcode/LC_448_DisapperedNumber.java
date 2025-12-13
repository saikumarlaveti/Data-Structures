package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LC_448_DisapperedNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list =new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int a :nums){
            hs.add(a);
        }
        for(int i = 1;i<=nums.length;i++){
            if(!hs.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
