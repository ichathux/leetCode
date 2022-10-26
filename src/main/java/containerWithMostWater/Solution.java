package containerWithMostWater;

public class Solution {

    public int maxArea(int[] height) {

            int area = 0;
            int left = 0;
            int right = height.length-1;

            while (left < right){
                int width = right-left;
                if (area < (height[left] < height[right] ? height[left]:height[right])*width){
                    area = (height[left] < height[right] ? height[left]:height[right])*width;
                }
                if (height[left] <= height[right]){
                    left++;
                }else {
                    right--;
                }
            }

        return area;

    }
}
