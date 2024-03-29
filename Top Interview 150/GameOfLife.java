import java.util.Arrays;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        // int[][] board = {{1,1},{1,0}};
        gameOfLive(board);
        System.out.println(Arrays.deepToString(board));
    }

    public static void gameOfLive(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int num = numOfLive(board, i, j);
                if (board[i][j] >= 1) {
                    if (num < 2 || num > 3) {
                        board[i][j] = 2;
                    }
                }
                else {
                    if (num == 3) board[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 2) board[i][j] = 0;
                else if (board[i][j] == -1) board[i][j] = 1;
            }
        }
    }

    public static int numOfLive(int[][] board, int x, int y) {
        int count = 0;
        for (int i = x - 1; i < x + 2; i++) {
            for (int j = y - 1; j < y + 2; j++) {
                if (!(i == x && j == y) && isLive(board, i, j)) count++;
            }
        }
        return count;
    }

    public static boolean isLive(int[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
        if (board[i][j] >= 1) return true;
        return false;
    }
}
