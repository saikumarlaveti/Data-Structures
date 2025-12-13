package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LC_217_ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        boolean res = false;
        for(int i  =0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    res = true;
                    return res;
                }
            }
        }
        return res;
    }
    public boolean ContainsDuplicates_1(int[] arr){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }

    public boolean ContainsDuplicates_2(int[] arr){
        Set<Integer> res = new HashSet<>();
        for(int a:arr){
            if(!res.add(a)){
                return true;
            }
      }
      return false;
    }



    public static void main(String[] args) {
        LC_217_ContainsDuplicates cd = new LC_217_ContainsDuplicates();
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,1};
        System.out.println("---------------------------------------");
        System.out.println( cd.containsDuplicate(a));
        System.out.println(cd.containsDuplicate(b));
        System.out.println("---------------------------------------");
        System.out.println(cd.ContainsDuplicates_1(a));
        System.out.println(cd.ContainsDuplicates_1(b));
        System.out.println("---------------------------------------");
        System.out.println(cd.ContainsDuplicates_2(a));
        System.out.println(cd.ContainsDuplicates_2(b));
        System.out.println("---------------------------------------");

        System.out.println("In Streams :");
        boolean res = Arrays.stream(a).boxed().collect(Collectors.toSet()).size()<a.length;
        boolean res_1 = Arrays.stream(b).boxed().collect(Collectors.toSet()).size()<a.length;

        System.out.println(res);
        System.out.println(res_1);

    }

}
