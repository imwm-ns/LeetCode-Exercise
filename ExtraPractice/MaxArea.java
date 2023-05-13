package ExtraPractice;

public class MaxArea {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        
        while (left < right) {
            int w = right - left, h = Math.min(height[left], height[right]);
            int area = w * h;
            max = Math.max(area, max);
            if (height[left] < height[right]) left++;
            else if (height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
