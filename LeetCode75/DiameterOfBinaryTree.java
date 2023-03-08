public class DiameterOfBinaryTree {
    static int path = 0;
    public static void main(String[] args) {
        
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return path;
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        path = Math.max(path, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
