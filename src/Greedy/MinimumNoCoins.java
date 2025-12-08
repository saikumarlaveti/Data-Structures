package Greedy;

import java.util.Arrays;

public class MinimumNoCoins {

    public static int minimumCoins(int[] coins,int amount){
        Arrays.sort(coins);
        int n = coins.length-1;
        int count = 0;
        for(int i  = n; i>=0;i--){

            if(amount >= coins[i] ){

                int res = (amount/coins[i]);

                count += res;

                amount -= (coins[i] * res);

            }
            if(amount == 0)
                    break;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] coins = {5,2,10,1};
        int amount = 39;
        System.out.println(minimumCoins(coins,amount));  // 6
    }
}
