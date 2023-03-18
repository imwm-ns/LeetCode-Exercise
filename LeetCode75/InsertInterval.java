import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] merged = new int[intervals.length + 1][];
        int c = 0;

        for (int[] item : intervals) merged[c++] = item;

        merged[intervals.length] = newInterval;
        Arrays.sort(merged, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> lst = new ArrayList<>();
        for (int[] arr : merged) {
            if (lst.size() == 0) lst.add(arr);
            else {
                int[] prevArr = lst.get(lst.size() - 1);
                if (arr[0] <= prevArr[1]) {
                    prevArr[1] = Math.max(prevArr[1], arr[1]);
                }
                else lst.add(arr);
            }
        }
        return lst.toArray(new int[lst.size()][]);
    }
}
