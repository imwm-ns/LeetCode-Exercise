public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
            int ele1 = mat[i][i];;
            int ele2 = mat[i][(len - 1) - i];
            sum += ele1 + ele2;
        }
        
        if (len % 2 == 0) return sum;
        else return sum - mat[len / 2][len / 2];
    }
}
