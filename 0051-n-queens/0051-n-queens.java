class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char[n][n];

        for(int i = 0 ; i<n;i++){
            Arrays.fill(board[i],'.');
        }
        nQueens(board,0,n,ans);
        return ans;
    }
    static void nQueens(char [] [] board, int row , int n ,  List<List<String>>ans){
        if(row==n){
          List<String> res = new ArrayList<>();
          for(char []r :board  ){
            res.add(new String(r));
          }
          ans.add(res);
          return;
        }
        for(int j = 0 ; j<n;j++){
            if(isSafe(board,row,j,n)){
                board[row][j] = 'Q';
                nQueens(board,row+1,n,ans);
                board[row][j] = '.';
            }
        }
        
    }
    static boolean isSafe(char [] [] board, int row,int col, int n){
            for(int j =  0; j<n;j++){
                if(board[row][j]=='Q') return false;
            }
            for(int i = 0 ; i<n;i++){
                if(board[i][col]=='Q') return false;
            }
            for(int i = row, j = col; i>=0 && j>=0; i--,j--){
                if(board[i][j]=='Q') return false;

            }
            for(int i = row ,j=col;i>=0 && j<n ; i--,j++){
                if(board[i][j]=='Q') return false;

             }
             return true;
        }
}