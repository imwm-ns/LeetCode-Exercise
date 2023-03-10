public class SortedArrayToBST {
    public static void main(String[] args) {
        
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }

    public static TreeNode createBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int m = (right + left) / 2;

        TreeNode root = new TreeNode(nums[m]);
        root.left = createBST(nums, left, m - 1);
        root.right = createBST(nums, m + 1, right);
        return root;
    }
}
