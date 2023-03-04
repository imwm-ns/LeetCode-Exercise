import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4}, nums2 = {6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        boolean nextGen = true;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && nextGen) {
                    if (j == nums2.length - 1) ans[i] = -1;
                    else if (j < nums2.length - 1) {
                        if (nums2[j + 1] > nums2[j]) {
                            ans[i] = nums2[j + 1];
                            break;
                        }
                        ans[i] = -1;
                    }
                    nextGen = false;
                }
            }
            nextGen = true;
        }
        return ans;
    }
}