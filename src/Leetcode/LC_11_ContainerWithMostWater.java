package Leetcode;

public class LC_11_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        //failed in some test cases
        int max = 0;
        for(int i = 0;i<height.length;i++) {
            int left = i;
            int right = height.length-1;
            while (left < right) {
                int minElement = Math.min(height[left], height[right]);
                int sum = minElement*(right-left);
                if (max < sum) {
                    max = sum;
                }
                right--;
            }
        }
    return max;
    }

    //edge test case
    public int maxArea_01(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max_area = 0;

        while(left < right ){
            int h = Math.min(height[left],height[right]);
            int w = right - left;
            int area = h * w;

            max_area = Math.max(max_area,area);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return max_area;
    }
    public static void main(String[] args) {
    //int[] arr  = {1,8,6,2,5,4,8,3,7};
        int[] arr= {1,1};
        System.out.println(maxArea(arr));
    }
}
