public class FindRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}}, target = {{1, 0}, {0, 1}};
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) return true;
            mat = rotate(mat);
        }
        return false;
    }

    public static int[][] rotate(int[][] matrix) {
        int rows = matrix.length;

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows / 2; j++ ) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][rows - j - 1];
                matrix[i][rows - j - 1] = temp;
            }
        }
        return matrix;
    }

    public static boolean isEqual(int[][] m1 , int[][] m2){
        if(m1.length != m2.length) return false;
        if(m1[0].length != m2[0].length) return false;
        for(int row = 0; row < m1.length; row++){
            for(int col = 0; col < m1[0].length; col++){
                if(m1[row][col] != m2[row][col]) return false;
            }
        }
        return true;
    }
}
