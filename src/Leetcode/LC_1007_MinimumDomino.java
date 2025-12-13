package Leetcode;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LC_1007_MinimumDomino {
    public static int minDominoRotations(int[] tops, int[] bottoms) {
    int[] freq = new int[500];

    for(int i = 0;i<tops.length;i++){
        freq[tops[i]]++;
    }
    //Arrays.sort(freq);
    //int miximum = freq[freq.length-1];
        System.out.println(Arrays.toString(freq));
       // System.out.println(miximum);

        int maximum = 0;
        for(int i =0;i<freq.length;i++){
            if(freq[maximum]<freq[i]){
                maximum = i;
            }
        }
        System.out.println(freq[maximum]);
        System.out.println(maximum);
        int height = maximum;
        int count = 0;

        for(int j = 0;j<tops.length;j++){
            if(tops[j] != height){
                if(bottoms[j] == height){
//                    tops[j] = tops[j] + bottoms[j];
//                    bottoms[j] = tops[j] - bottoms[j];
//                    tops[j] = tops[j] - bottoms[j];
                    int temp = tops[j];
                    tops[j] = bottoms[j];
                    bottoms[j] = temp;
                    ++count;
                }
                else {
                    return -1;
                }
            }
        }
        System.out.println("count : " + count);
    return count;
    }


public static void main(String[] args) {
        int[] tops = {2,1,2,4,2,2};
        int[] bottoms = {5,2,6,2,3,2};
        System.out.println(minDominoRotations(tops,bottoms));

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
       if(set.contains(1)){
            set = null;
    }
    }
}
