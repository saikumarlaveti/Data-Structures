package DataStructureClasses;

public class Class_07 {

    public static int missingNumber(int[] arr){

        int length = arr.length;
        int totalSum = length*(length+1)/2;
        System.out.println(totalSum);
        for(int i = 0;i<arr.length;i++){
            totalSum -= arr[i];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(missingNumber(arr));
    }
}
