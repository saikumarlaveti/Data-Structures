package Leetcode;

public class LC_1952_ThreeDivisors {
    public static   boolean isThree(int n){
        int count = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        return count == 3;
    }

    public static   boolean isThree1(int n){
        int count = 1;
        for(int i = 1;i<=n/2;i++){
            if(n%i==0)
                count++;
        }
        return count == 3;
    }


    public static void main(String[] args) {
        System.out.println(isThree(2));
        System.out.println(isThree(4));
        System.out.println(isThree(2));
        System.out.println(isThree1(4));
    }
}
