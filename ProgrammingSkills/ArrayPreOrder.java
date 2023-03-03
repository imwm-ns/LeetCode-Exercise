import java.util.ArrayList;
import java.util.List;

public class ArrayPreOrder {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }

    public void traversal(Node root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        for (Node child : root.children) {
            traversal(child, res);
        }
    }
}

