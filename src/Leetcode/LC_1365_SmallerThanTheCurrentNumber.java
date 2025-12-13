package Leetcode;

public class LC_1365_SmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    count ++;
                }
            }
            temp[i] = count;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        LC_1365_SmallerThanTheCurrentNumber scn = new LC_1365_SmallerThanTheCurrentNumber();
        int[] res = scn.smallerNumbersThanCurrent(arr);
        for(int a :res){
            System.out.print(a + " ");
        }
    }
}
