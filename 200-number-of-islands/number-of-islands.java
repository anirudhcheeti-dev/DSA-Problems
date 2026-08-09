class Solution {
    public int numIslands(char[][] grid) {
       //We Declare a Varaible Islands
        int Islands=0;
        //A nested For loop to check each element in the matrix to find the region with 1.
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
              if(grid[i][j]=='1'){
                Islands++;
                //if 1 is found we update islands and do a dfs to check if the nieghbours also have 1s
                dfs(grid,i,j);
              }
            }
        }
        return Islands;
    }
    public void dfs(char[][] grid,int row,int col){
        //int[][] dire={{-1,0},{1,0},{0,-1},{0,1}};
        //A simpler way to check for top left right bottom.
        //Causing a high runtime hence we skip these.
            if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]=='0'){
                return;
            }
            //if exceeds this case we break
            grid[row][col]='0';
            // for(int[] dir :dire){
            //     int nr=row+dir[0];
            //     int nc=col+dir[1];
            //Causing high runtime hence we update manually with dir and without any loop.
            dfs(grid,row-1,col);
            dfs(grid,row+1,col);
            dfs(grid,row,col-1);
            dfs(grid,row,col+1);
            //This is the manual way to check top left right bottom
    }
}