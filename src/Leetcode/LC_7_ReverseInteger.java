package Leetcode;

public class LC_7_ReverseInteger {
    public int reverseInteger(int n){
        int sum = 0;int rem = 0;
        while(n != 0){
            rem = n % 10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
            sum = (sum *10)+rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int x =- 123;
        int y  = 345;
        LC_7_ReverseInteger ri = new LC_7_ReverseInteger();
        System.out.println(ri.reverseInteger(x));
        System.out.println(ri.reverseInteger(y));


        System.out.println("-------------------------------------------------------------------------------- Streams ( ) --------------------------------------------------------------------------------------------------");
        int a = -567;
        boolean isNegative = a<0;
        System.out.println(isNegative);

        String reversedStr = Integer.toString(Math.abs(x))
                .chars() // Convert to ASCII IntStream
                .mapToObj(c -> (char) c) // Convert ASCII to Character
                .map(String::valueOf) // Convert Character to String
                .reduce("", (b, c) -> c + b); // Reverse order

        int reversed = Integer.parseInt(reversedStr);
        int result = isNegative ?-reversed : reversed;
        System.out.println(result);

    }
}
