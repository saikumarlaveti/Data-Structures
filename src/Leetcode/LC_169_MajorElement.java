package Leetcode;

public class LC_169_MajorElement {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        boolean[] visit = new boolean[length];

        for(int i = 0;i<length-2;i++){
            for(int j = i+1;j<length-1;j++){
                if(nums[i] == nums[j] && visit[i] == false){
                    
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
    }
}
