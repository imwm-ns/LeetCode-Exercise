import java.util.Arrays;

public class FindMinArrowShots {
    public static void main(String[] args) {
        int[][] points = {{10,16}, {2,8}, {1,6}, {7, 12}};
        // int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        // int[][] points = {{1,2},{2,3},{3,4},{4,5}};

        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        /*
            Sample data: {{10,16}, {2,8}, {1,6}, {7, 12}}
            Step:
                1. Default value of points[i] = [Xs, Xe] -> s = start, e = end.
                2. Compare to sort a deep nested array from min to max.
                3. Initial a value of prev = 0, arrows = 1.
                4. Use for loop to interval points array start with index = 1 (cur = 1).
                5. Check a condition if points[prev][1] < points[cur][0].
                    round 1: 6 < 2 - false.
                    round 2: 6 < 7 - true arrows += 1 (1), set a value of prev = cur (2).
                    round 3: 12 < 10 - false.
                    exit
                6. return arrows.
        */
        int arrows = 1, prev = 0;
        
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        
        for (int cur = 1; cur < points.length; cur++) {
            if (points[prev][1] < points[cur][0]) {
                arrows++;
                prev = cur;
            }
        }

        return arrows;
    }
}
