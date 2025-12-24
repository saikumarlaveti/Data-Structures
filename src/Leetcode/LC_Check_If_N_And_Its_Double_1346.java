package Leetcode;

public class LC_Check_If_N_And_Its_Double_1346 {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == 2*arr[j] && i != j)
                    return true;

            }
        }
        return false;
    }
}


