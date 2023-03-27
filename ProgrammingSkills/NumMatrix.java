class NumMatrix {
    int[][] matrix;
    public NumMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        this.matrix = matrix;

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i - 1][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int totalArea = matrix[row2][col2];
        int above = (row1 == 0) ? 0 : matrix[row1 - 1][col2];
        int sidePart = (col1 == 0) ? 0 : matrix[row2][col1 - 1];
        int duplicatePart = (col1 == 0 || row1 == 0) ? 0 : matrix[row1 - 1][col1 - 1];
        int res = (totalArea - above) - (sidePart - duplicatePart);
        return res;
    }
}
