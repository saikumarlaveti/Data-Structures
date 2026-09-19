package Leetcode;

public class LC_1854_MaximumPopulationYear {
    public static int maximumPopulation(int[][] logs) {
        int left = 0;
        int right = 0;
        int index = 0;
        int length = logs.length ;
        int result = 0;
        while(index<length) {
            int currentYear = logs[left][0];
            for (int j = 0; j < logs.length; j++) {
                for (int k = 0; k < logs.length; k++) {
                    if(currentYear <= logs[j][k]){
                        if(currentYear>=logs[j][k]){
                            result++;
                        }
                    }
                }
            }
            left++;
            index++;
        }
        return  result;
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(arr));
        System.out.println(arr.length* arr.length);
    }
}
