import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}}; int k = 1;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        int l = 0, r = points.length - 1;
        while (l <= r) {
            int mid = helper(points, l, r);
            if (mid == k) break;
            if (mid < k) l = mid + 1;
            else r = mid - 1;
        }
        return Arrays.copyOfRange(points, 0, k);
    }

    public static int helper(int[][] point, int l, int r) {
        int[] pivot = point[l];
        while (l < r) {
            while (l < r && compare(point[r], pivot) >= 0) r--;
            point[l] = point[r];
            while (l < r && compare(point[l], pivot) <= 0) l++;
            point[r] = point[l];
        }
        point[l] = pivot;
        return l;
    }

    public static int compare(int[] p0, int[] p1) {
        return (p0[0] * p0[0] + p0[1] * p0[1]) - (p1[0] * p1[0] + p1[1] * p1[1]);
    }
}
