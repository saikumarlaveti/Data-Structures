package Leetcode;

public class LC_605_CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;
        for(int i = 0;i<len;i++){
            if(flowerbed[i] == 0){
                boolean left = (i == 0) || (flowerbed[i-1] == 0);
                boolean right = ((i == len-1) || (flowerbed[i+1] == 0));

                if(left && right){
                    flowerbed[i] = 1;
                    count++;
                    i++;
                    if(count >= n)
                        return true;
                }
            }
        }
        return count >= n;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(arr, 1));
        System.out.println(canPlaceFlowers(arr, 2));
    }

}