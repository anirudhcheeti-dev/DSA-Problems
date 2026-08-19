class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i==0||j==0||i==board.length-1||j==board[0].length-1){
                    if(board[i][j]=='O'){
                        dfs(board,i,j);
        //Done to check if the boundary wall has any island connected;
                    }
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O') board[i][j]='X';
                if(board[i][j]=='#') board[i][j]='O';
            }
        }

        //This is Run to convert all 'O' which are covered to 'X';
        //This is Run to convert all '#' back to 'O';
    }
    public void dfs(char[][] board,int row,int col){
        if(row<0||row>board.length-1||col<0||col>board[0].length-1||board[row][col]=='X'||board[row][col]=='#'){
            return;
        }

        board[row][col]='#';
        //making these boundary islands to an #.

        dfs(board,row-1,col);
        //top
        dfs(board,row+1,col);
        //donw
        dfs(board,row,col-1);
        //left
        dfs(board,row,col+1);
        //right
    }
}

//Good quetion