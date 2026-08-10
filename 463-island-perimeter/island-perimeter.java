class Solution {
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                     return dfs(grid,i,j);
                }
            }
        }
        return 0;
    }
    public int dfs(int[][] grid,int row ,int col){
        if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]==0){
            return 1;
        }
        //if invalid then we add 1 because it is a perimeter.
        if(grid[row][col]==-1){
            return 0;
        }
        //if we found an island which we already visited so we dont add nothing.
        grid[row][col]=-1;
        //declare -1 to make sure this was already visited island
        int perimeter=0;
        perimeter+=dfs(grid,row-1,col);
        perimeter+=dfs(grid,row+1,col);
        perimeter+=dfs(grid,row,col-1);
        perimeter+=dfs(grid,row,col+1);
        //add the perimeter recursively.
        return perimeter;
    }
}