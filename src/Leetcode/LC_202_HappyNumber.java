package Leetcode;

public class LC_202_HappyNumber {

        public boolean isHappy(int n) {
            if(n==1 || n==7) return true;
            if(n<=9) return false;
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n/=10;
            }
            return isHappy(sum);
        }
    }