package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_728_SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> dividing = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;
            boolean isSelfDividing = true;

            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) {
                    isSelfDividing = false;
                    break; // Stop checking further
                }
                num /= 10;
            }

            if (isSelfDividing) {
                dividing.add(i);
            }
        }
        return dividing;
    }

    public static void main(String[] args) {
        LC_728_SelfDividingNumbers sdn = new LC_728_SelfDividingNumbers();
        List<Integer> result = sdn.selfDividingNumbers(48, 50);
        result.forEach(i -> System.out.print(i + " "));
    }
}
