import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer>{
    static Deque<NestedInteger> queue = new ArrayDeque<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        prepareQueue(nestedList);
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            return null;
        }
        return queue.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!queue.isEmpty() && !queue.peek().isInteger()) {
            List<NestedInteger> lst = queue.pop().getList();
            prepareQueue(lst);
        }
        return !queue.isEmpty();
    }

    private static void prepareQueue(List<NestedInteger> nestedList) {
        for (int idx = nestedList.size() - 1; idx >= 0; idx--) {
            queue.push(nestedList.get(idx));
        }
    }
}
