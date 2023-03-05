public class CheckStraightLine {
    public static void main(String[] args) {
        int[][] coordinates = {{2, 1}, {4, 2}, {6, 3}};
        System.out.println(checkStraightLine(coordinates));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 1 || coordinates.length == 2) return true;

        double x1 = coordinates[0][0], y1 = coordinates[0][1];
        double x2 = coordinates[1][0], y2 = coordinates[1][1];
        double m;
        if (x2 - x1 == 0) m = -1;
        else m = (y2 - y1) / (x2 - x1);
        
        for (int i = 2; i < coordinates.length; i++) {
            x1 = coordinates[i - 1][0]; y1 = coordinates[i - 1][1];
            x2 = coordinates[i][0]; y2 = coordinates[i][1];
            double slope;
            if (x2 - x1 == 0) slope = -1;
            else slope = (y2 - y1) / (x2 - x1);
            if (m != slope) return false;
        }
        return true;
    }
}
