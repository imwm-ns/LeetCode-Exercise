public class NearestValidPoint {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = Integer.MAX_VALUE;
        int idx = -1;
        
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                int dist = Math.abs(point[0] - x) + Math.abs(point[1] - y);
                if (dist < minDist) {
                    minDist = dist;
                    idx = i;
                }
            }
        }
        return idx;
    }
}
