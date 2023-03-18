import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> arr = new ArrayList<>();
        int[] cur = intervals[0];
        arr.add(intervals[0]);

        for (int[] item : intervals) {
            if (item[0] <= cur[1]) cur[1] = Math.max(cur[1], item[1]);
            else {  
                cur = item;
                arr.add(cur);
            }
        }
        int[][] res = new int[arr.size()][2];
        for (int i = 0; i < arr.size(); i++) res[i] = arr.get(i);
        return res;
    }
}
