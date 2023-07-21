import java.util.HashSet;

public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet <String> seen = new HashSet <>();
        
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                char val = board[i][j];
                if (val != '.') {
                    if (!seen.add(val + "row" + i)
                        ||!seen.add(val + "col" + j)
                        ||!seen.add(val + "grid" + i / 3 + "-" + j / 3)) 
                        return false;
                }
            }
        }
        return true;
    }
}