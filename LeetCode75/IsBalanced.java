public class IsBalanced {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(1, null, null);
        // If you set right to 1 child and It have 2 children, The left and right child as same as 2 child. The output will show your answer is false.
        TreeNode right = new TreeNode(4, new TreeNode(3, new TreeNode(0, left, left), new TreeNode(0, null, null)), new TreeNode(5, null, null));
        TreeNode root = new TreeNode(2, left, right);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        if (leftHeight == -1) return -1;

        int rightHeight = height(root.right);
        if (rightHeight == -1) return - 1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }

}
