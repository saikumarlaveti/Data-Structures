package Leetcode;

public class LC_1394_Lucky_Integer_In_Array {
    public int findLucky(int[] arr) {
     int count = 0;
     int LuckyNumber = -1;
     for(int i = 0;i<arr.length;i++) {
         count = 0;
         for (int j = 0; j < arr.length; j++) {
             if (arr[i] == arr[j]) {
                 count++;
             }
         }
         if (arr[i] == count) {
             LuckyNumber = Math.max(count, LuckyNumber);
         }
     }
     return LuckyNumber;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3}; // 3
        int[] brr =  {2,3,3,3,4,4,4,4,5,5,5,5}; // 4
        int[] crr = {2,2,2,3,3}; //-1
        LC_1394_Lucky_Integer_In_Array lc  = new LC_1394_Lucky_Integer_In_Array();
       System.out.println(lc.findLucky(arr));
        System.out.println(lc.findLucky(brr));
        System.out.println(lc.findLucky(crr));
    }
}



