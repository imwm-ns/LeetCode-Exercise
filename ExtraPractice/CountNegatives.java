package ExtraPractice;

public class CountNegatives {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int i = rows - 1, j = 0, res = 0;

        while (i >= 0 && j < columns) {
            if (grid[i][j] < 0) {
                i--;
                res += columns - j;
            }
            else j++;
        }

        return res;
    }
}