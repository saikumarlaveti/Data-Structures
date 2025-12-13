package Leetcode;

public class LC_11_ContainerMostWater {
    public static int maxArea(int[] height) {
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
    int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));  // 49
    }
}
//https://leetcode.com/problems/container-with-most-water/description/?listId=79h8rn6