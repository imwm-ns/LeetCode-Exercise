import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeLevelOrder {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        traverseTree(root, map, 0);
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        List<List<Integer>> res = new ArrayList<>();
        for (int key : keys) res.add(map.get(key));
        return res;
    }

    public static void traverseTree(Node node, Map<Integer, List<Integer>> map, int level) {
        if (node == null) return;
        level++;

        List<Integer> lst = map.get(level);
        if (lst == null) {
            lst = new ArrayList<>();
            lst.add(node.val);
            map.put(level, lst);
        }
        else lst.add(node.val);

        for (int i = 0; i < node.children.size(); i++) {
            Node child = node.children.get(i);
            traverseTree(child, map, level);
        }
    }
}
