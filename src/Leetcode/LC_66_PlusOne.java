package Leetcode;

import java.util.Arrays;

public class LC_66_PlusOne {
        public int[] plusOne(int[] digits) {
            int n = digits.length;

            // Traverse from the last digit
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;  // Simply increment and return
                    return digits;
                }
                digits[i] = 0; // If 9, turn it into 0 and continue
            }

            // If we reach here, it means we had a carry (e.g., 999 -> 1000)
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1; // Set the first element as 1, rest are default 0
            return newDigits;
        }

        public static void main(String[] args) {
            LC_66_PlusOne obj = new LC_66_PlusOne();

            int[] digits1 = {2, 2, 9};
            int[] digits2 = {9};
            int[] digits3 = {9, 9, 9};

            System.out.println(Arrays.toString(obj.plusOne(digits1))); // [1, 2, 4]
            System.out.println(Arrays.toString(obj.plusOne(digits2))); // [1, 0]
            System.out.println(Arrays.toString(obj.plusOne(digits3))); // [1, 0, 0, 0]
        }
    }

