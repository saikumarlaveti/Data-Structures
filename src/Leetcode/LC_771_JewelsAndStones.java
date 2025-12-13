package Leetcode;

public class LC_771_JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        for(int i = 0;i<jewels.length();i++){
            for(int j = 0 ;j<stones.length();j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
//https://leetcode.com/problems/jewels-and-stones/submissions/1689883541