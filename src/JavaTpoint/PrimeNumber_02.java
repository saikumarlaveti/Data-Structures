package JavaTpoint;

import java.util.ArrayList;

public  class PrimeNumber_02 {
    public static void primeNumber(int limit) {
        ArrayList<Integer> list  = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            boolean flag = true;
            for(int j = 2;j<i;j++){
                if(i%j == 0){
                        flag = false;
                }
            }
            if(flag) {
            list.add(i);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        primeNumber(100);
    }
}
