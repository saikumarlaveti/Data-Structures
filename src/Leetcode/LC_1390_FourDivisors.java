package Leetcode;

public class LC_1390_FourDivisors {
    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++) {
            int num = nums[i];
            long isSquare = (long) Math.sqrt(num);
            boolean result = isSquare == (long) num * num;
            if (result) {
                continue;
            }
                else{
                    if (FourDivisor(num) && !result) {
                        sum += num;
                        for (int j = 1; j <= num / 2; j++) {
                            if (num % j == 0)
                                sum += j;
                        }
                    }
                }

        }
        return sum;
    }

    public static boolean FourDivisor(int num){
        int divisor = 2;
        for(int i = 2;i<=num/2;i++){
            if(num%i == 0)
                divisor++;
        }
        return divisor == 4;
    }

    // All Test cases passed
    public static int sumFourDivisors_1(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            int sum = 0;
            int count = 0;

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;

                    if (d1 == d2) {
                        count++;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }
                }

                if (count > 4) break;
            }

            if (count == 4) {
                totalSum += sum;
            }
        }

        return totalSum;
    }
    public static void main(String[] args) {
            int[] arr = {21,4,7};
        System.out.println(sumFourDivisors(arr));

//        long a = 4;
//        Long result =(long) Math.sqrt(a);
//        System.out.println(result*result == a);
//        System.out.println(result);
    }

}
