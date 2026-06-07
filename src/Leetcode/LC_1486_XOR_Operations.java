package Leetcode;

public class LC_1486_XOR_Operations {
    public int xorOperation(int n, int start) {
        int index = 0;
        int result = 0;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[index++] = start+(2*i);
        }
        for(int j = 0;j<arr.length;j++){
            result = result ^ arr[j];
        }
        return result;
    }
}
