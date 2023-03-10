public class SearchMatrix {
    public static void main(String[] args) {
        
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        for (i = 0; i < matrix.length; i++) {
            if (target > matrix[i][matrix[0].length - 1]) continue;
            else {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == target) return true;
                }
            }
        }
        return false;
    }
}
