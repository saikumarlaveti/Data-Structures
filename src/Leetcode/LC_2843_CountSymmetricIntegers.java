package Leetcode;

public class LC_2843_CountSymmetricIntegers {
    public static int countSymmetricIntegers(int low, int high) {
        int leftCount ;
        int rightCount;
        int total = 0;
        for(int i = low ;i<=high;i++){
// convert integer to String
            String a = Integer.toString(i);
            //find half
            int half = a.length()/2;
            //if length of the string is even then  only allow the if condition
            if(a.length() %2 ==0){
                leftCount = 0;
                rightCount = 0;
                //first half
                String s1 = a.substring(0,half);
                //second half
                String s2 = a.substring(half,a.length());
           // calculate the sum
            for(int j = 0;j<=s1.length()-1;j++){
                leftCount += Character.getNumericValue(s1.charAt(j));
            }
                for(int k= 0;k<=s2.length()-1;k++){
                    rightCount += Character.getNumericValue(s2.charAt(k));
                }
                if(leftCount == rightCount){
                   // System.out.println(i);
                    total++;
            }

            }
        }
        return total;
    }

    public static int countSymmetricIntegers1(int low , int high){
        int count = 0;
        for(int i = low;i<=high;i++){
            String s = String.valueOf(i);
            int len = s.length();
            if(len%2 != 0)    continue;
            int half = len/2;
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0;j<half;j++){
                sum1 += s.charAt(j);
                sum2 += s.charAt(j+half);
            }
            if(sum1 == sum2)  count++;
        }
        return  count;
    }

    public static void main(String[] args) {
        System.out.println( countSymmetricIntegers(1,100));
        System.out.println( countSymmetricIntegers1(1,100));
      System.out.println(countSymmetricIntegers(1200,1230));
        System.out.println(countSymmetricIntegers1(1200,1230));

    }
}

