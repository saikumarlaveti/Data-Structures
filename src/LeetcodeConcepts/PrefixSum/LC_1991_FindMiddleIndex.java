package LeetcodeConcepts.PrefixSum;

public class LC_1991_FindMiddleIndex {
    public int findMiddleIndex(int[] nums) {

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        for(int i = 1;i<nums.length;i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        for(int j = nums.length-2;j>=0;j--){
            rightSum[j] = rightSum[j+1] + nums[j+1];
        }

        for(int k = 0;k<nums.length;k++){
            if(leftSum[k] == rightSum[k]){
                return k;
            }

        }
        return -1;

    }
}
