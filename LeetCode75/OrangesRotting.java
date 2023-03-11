import java.util.LinkedList;
import java.util.Queue;

public class OrangesRotting {
    static int[][] arr;
    public static void main(String[] args) {
        int[][] grid = {{1}, {2}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        arr = grid;
        // possible movement
        int[] u = {0, 0, -1, 1};
        int[] v = {1, -1, 0, 0};
        Queue<int[]> queue = new LinkedList<>();
        int zero = 0, two = 0, one = 0;
        // ------------------------------------------------------------------------------            
        //count the zeros,twos and ones and store rotten orange into queue 
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) zero++;
                else if (grid[i][j] == 1) one++;
                else two++;

                if (grid[i][j] == 2) queue.add(new int[]{i, j, 0});
            }
        }
        // ------------------------------------------------------------------------------     
        int ans = 0;
        //optional as this check has no effect in long run
        int size = grid.length * grid[0].length;
        if (zero == size || two == size) return 0;
        if (one == size) return -1;
        // ------------------------------------------------------------------------------
        while (!queue.isEmpty()) {
            size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] temp = queue.poll();
                int cost = temp[2];
                for (int l = 0; l < 4; l++) {
                    int a = temp[0] + u[l];
                    int b = temp[1] + v[l];
                    if (inRange(a, b) && grid[a][b] == 1) { //adding an adjacent fresh orange into queue and rotting it.
                        queue.add(new int[]{a, b, cost + 1});
                        grid[a][b] = 2;
                        ans = cost + 1; //storing time elapsed.
                        one--; //reducing the count of fresh orange.
                    }
                }
                if (one <= 0) break; //if no fresh orange left break.
            }
        }
        if (one != 0) return -1; //it is not possible to rotate all orange.
        return ans;
    }

    public static boolean inRange(int i, int j) {
        return !(i < 0 || i > arr.length - 1 || j < 0 || j > arr[0].length - 1);
    }
}
