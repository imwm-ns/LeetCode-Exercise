public class InvertTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        print(invertTree(root));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode tempLeft = root.left;
        TreeNode tempRight = root.right;

        root.left = tempRight;
        root.right = tempLeft;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void print(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + "\n");
        print(root.left);
        print(root.right);
    }
}
