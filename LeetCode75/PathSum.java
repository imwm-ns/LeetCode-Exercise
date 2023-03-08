public class PathSum {
    int numPaths = 0;
    int targetedSum;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        targetedSum = targetSum;
        compute(root);
        return numPaths;
    }

    public void compute(TreeNode root) {
        if (root == null) return;
        computeSumInPath(root, 0);
        compute(root.left);
        compute(root.right);
    }

    public void computeSumInPath(TreeNode root, long curSum) {
        curSum += (long) root.val;

        if ((long) targetedSum == curSum) numPaths++;

        if (root.left != null) computeSumInPath(root.left, curSum);
        if (root.right != null) computeSumInPath(root.right, curSum);
    }
}
