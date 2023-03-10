public class KthSmallest {
    static int count = 0;
    public static void main(String[] args) {
        
    }

    public static int kthSmallest(TreeNode root, int k) {
        count = k;
        return findIndex(root);
    }

    public static int findIndex(TreeNode root) {
        if (root == null) return -1;
        int ans = findIndex(root.left);
        if (ans != -1) return ans;
        if (count == 1) return root.val;
        count--;
        return findIndex(root.right);
    }
}
