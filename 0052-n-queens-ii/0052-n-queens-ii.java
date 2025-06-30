class Solution {
    public int totalNQueens(int n) {
        return countNQueens(new char[n][n], 0, n);
    }

    static int countNQueens(char[][] board, int row, int n) {
        if (row == n) return 1;

        int count = 0;
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                board[row][j] = 'Q';
                count += countNQueens(board, row + 1, n);
                board[row][j] = '.';
            }
        }
        return count;
    }

    static boolean isSafe(char[][] board, int row, int col, int n) {
       
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}
