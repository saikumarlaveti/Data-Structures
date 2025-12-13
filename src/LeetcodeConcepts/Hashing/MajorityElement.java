package LeetcodeConcepts.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static int occurence(int[] nums){
        //Create Hash map
        HashMap<Integer,Integer> res = new HashMap<>();
        //insert the elements
        for(int i =0;i<nums.length;i++) {
            if (res.containsKey(nums[i])) {
                int value = res.get(nums[i]);
                res.put(nums[i], ++value);
            } else {
                res.put(nums[i], 1);
            }
        }
        System.out.println(res);
            Set<Integer> result = res.keySet();
            int  b = 0 ;
            for(Integer a : result){
                if(res.get(a)>nums.length/3){
                    b = a;
                }
            }
        return b;
    }

    public static void occurence1(int[] nums){

      int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<nums.length;i++){
          arr[nums[i]]++;
      }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,5,1,1,4};
        System.out.println(occurence(nums));
        occurence1(nums);
    }
}
