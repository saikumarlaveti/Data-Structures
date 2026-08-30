package Leetcode;

public class LC_1413_MinStartValue {
    public static int minStartValue(int[] nums) {
        int StartValue = 1;
        boolean flag = true;

        int[] result = new int[nums.length];
        while(flag){
            result[0] = nums[0]+StartValue;
            boolean flag_1 = true;
            for(int i = 1;i<nums.length;i++){
                result[i] = nums[i] + result[i-1];
                if(result[i] <=0){
                    StartValue++;
                    flag_1 = false;
                    break;
                }
                }
            if(flag_1){
                return StartValue;
            }
        }
        return StartValue;
    }


    public static int minStartValue_01(int[] nums) {
        int StartValue = 1;
        if(nums.length == 1){
            if(nums[0] <=0){
                return Math.abs(nums[0])+1;
            }
            else{
                return StartValue;
            }
        }
        boolean flag = true;
        int[] result = new int[nums.length];
        if(nums[0] <=0){
            StartValue = Math.abs(nums[0])+1;
        }
        while(flag){
                result[0] = nums[0] + StartValue;
                boolean flag_1 = true;
                for (int i = 1; i < nums.length; i++) {
                    result[i] = nums[i] + result[i - 1];
                    if (result[i] <= 0) {
                        StartValue++;
                        flag_1 = false;
                        break;
                    }
                }
                if (flag_1) {
                    return StartValue;
                }

        }
        return StartValue;
    }
    public static void main(String[] args) {
        System.out.println(minStartValue_01(new int[]{-3,2,-3,4,2}));
    }
}

