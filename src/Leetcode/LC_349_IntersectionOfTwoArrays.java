package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC_349_IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> resultSet = new HashSet<>();

            for (int num : nums1) {
                set1.add(num);
            }

            for (int num : nums2) {
                if (set1.contains(num)) {
                    resultSet.add(num);
                }
            }

            int[] result = new int[resultSet.size()];
            int index = 0;
            for (int num : resultSet) {
                result[index++] = num;
            }

            return result;
        }

    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int res [] = intersection(num1,num2);
        System.out.println(Arrays.toString(res));
    }
}
