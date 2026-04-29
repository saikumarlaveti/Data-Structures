package List.Array.Problems;

public class GFG_10_CountPairsGivenSum {

    public static int countPairsGivenSum(int[] arr,int target){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(countPairsGivenSum(arr,6));

    }
}
