class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;

        for (int left = 0, right = height.length - 1; left < right;) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}