public class IsSymmetric {
    public static void main(String[] args) {
        
    }

    public static boolean isSymmetric(TreeNode root) {
        return isEquivalent(root.left, root.right);
    }

    public static boolean isEquivalent(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        else return left.val == right.val && isEquivalent(left.left, right.right) && isEquivalent(left.right, right.left);
    }
}