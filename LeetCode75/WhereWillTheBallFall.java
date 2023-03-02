import java.util.Arrays;

public class WhereWillTheBallFall {
    static int rows, cols;
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        System.out.println(Arrays.toString(findBall(grid)));
    }

    public static int[] findBall(int[][] grid) {
        rows = grid.length; 
        cols = grid[0].length;
        int[] res = new int[cols];
        for (int i = 0; i < cols; i++) {
            res[i] = helper(i, grid);
        }
        
        return res;
    }

    public static int helper(int idx, int[][] grid) {
        int r = 0, c = idx;
        while (r < rows) {
            int nextCol = c + grid[r][c];
            if (nextCol < 0 || nextCol > cols - 1 || grid[r][c] != grid[r][nextCol]) return -1;
            r++;
            c = nextCol;
        }
        return c;
    }
    
}
