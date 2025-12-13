package Leetcode;

public  class LC_2529_MaximumCountNegPos {
    public  int maximumCount(int[] nums) {
        int Negative = 0;
        int Positive = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] <0){
                Negative++;
            }
            else if(nums[i]>0){
                Positive++;
            }
        }
        return Math.max(Negative,Positive);

//         Long Negative  = GFG.Arrays.stream(nums).filter(i->i<0).count();
//         Long Positive = GFG.Arrays.stream(nums).filter(i->i>0).count();
//         return (int) Math.max(Negative,Positive);




    }
    public static void main(String[] args) {
            int[] arr = {-2,-1,-1,1,2,3};
            int[] brr = {-3,-2,-1,0,0,1,2};
            int[] crr = {5,20,66,1314};

            LC_2529_MaximumCountNegPos mcn = new LC_2529_MaximumCountNegPos();
            System.out.println(mcn.maximumCount(arr));
            System.out.println(mcn.maximumCount(brr));
            System.out.println(mcn.maximumCount(crr));



    }
}
