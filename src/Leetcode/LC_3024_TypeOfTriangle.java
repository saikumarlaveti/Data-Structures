package Leetcode;

public class LC_3024_TypeOfTriangle {
    public static String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a)
            return "none";
        else if ((b == c) && (c == a))
            return "equilateral";
         else if (a == b || b == c || c == a)
            return "isosceles";
         else
            return "scalene";

    }

    public static void main(String[] args) {
        int[] arr = {8,4,4};
        System.out.println(triangleType(arr));
    }
}

