public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int rain = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (leftMax < height[left]) leftMax = height[left];
                else rain += leftMax - height[left];
            }
            else {
                right--;
                if (rightMax < height[right]) rightMax = height[right];
                else rain += rightMax - height[right];
            }
        }

        return rain;
    }
}