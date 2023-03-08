import java.util.Arrays;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 2, 2)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length, cols = mat[0].length;

        if ((rows == r && cols == c) || rows * cols != r * c) return mat;
        int[][] reShape = new int[r][c];
        int rIdx = 0, cIdx = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (cIdx == c) {
                    rIdx++;
                    cIdx = 0;
                }
                reShape[rIdx][cIdx++] = mat[row][col];
            }
        }
        return reShape;
    }
}
