public class LinkLstInBinaryTree {
    public static void main(String[] args) {
        
    }

    public static boolean isSubPath(ListNode head, TreeNode root) {
        return helper(head, root);
    }

    public static boolean helper(ListNode head, TreeNode root) {
        if (root == null) return false;
        if (dfs(head, root)) return true;
        if (helper(head, root.left)) return true;
        if (helper(head, root.right)) return true;
        return false;
    }

    public static boolean dfs(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null || root.val != head.val) return false;
        if (dfs(head.next, root.left)) return true;
        if (dfs(head.next, root.right)) return true;
        return false;
    }
}
