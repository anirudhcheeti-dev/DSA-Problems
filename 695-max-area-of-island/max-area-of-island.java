class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
        //we declare dfs to calculate the total area.
        //we declare up down left bottom 
        //add 1 to each and get the result.
    }
    public int dfs(int[][] grid,int row,int col){
        if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]==0){
                return 0;
            }
            grid[row][col]=0;
            int up=dfs(grid,row-1,col);
            int down=dfs(grid,row+1,col);
            int left=dfs(grid,row,col-1);
            int right=dfs(grid,row,col+1);
            return 1+up+down+left+right;
    }
}