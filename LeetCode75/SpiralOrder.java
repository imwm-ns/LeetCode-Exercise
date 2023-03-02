import java.util.ArrayList;
import java.util.List;

class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Define the array using ArrayList.
        List<Integer> res = new ArrayList<>();

        // Define rows, cols of matrix.
        int rows = matrix.length, cols = matrix[0].length;

        // Define the boundary of matrix.
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        
        int dir = 1; // Define the direction to traversed in array.

        while (top <= bottom && left <= right) {
            switch (dir) {
                case 1:
                    for (int i = left; i <= right; i++) res.add(matrix[top][i]);
                    ++top;
                    dir = 2;
                    break;
                case 2:
                    for (int i = top; i <= bottom; i++) res.add(matrix[i][right]);
                    --right;
                    dir = 3;
                    break;
                case 3:
                    for (int i = right; i >= left; i--) res.add(matrix[bottom][i]);
                    --bottom;
                    dir = 4;
                    break;
                case 4:
                    for (int i = bottom; i >= top; i--) res.add(matrix[i][left]);
                    ++left;
                    dir = 1;
                    break;
            };
        }
        return res;
    }
}
