import java.util.ArrayList;
import java.util.List;

public class RightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(0, null, null), new TreeNode(3, null, null));
        System.out.println(rightSideView(root));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        util(lst, root, 0);
        return lst;
    }

    public static void util(List<Integer> lst, TreeNode root, int level) {
        if (root == null) return;
        if (lst.size() <= level) lst.add(level, root.val);
        else lst.set(level, root.val);
        util(lst, root.left, level + 1);
        util(lst, root.right, level + 1);
    }
}
