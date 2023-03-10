import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode> stackTree = new Stack<>();

    public BSTIterator(TreeNode root) {
        addAll(root);
    }

    public int next() {
        TreeNode temp = stackTree.pop();
        addAll(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
        return !stackTree.isEmpty();   
    }

    public void addAll(TreeNode root) {
        while (root != null) {
            stackTree.push(root);
            root = root.left;
        }
    }

}
