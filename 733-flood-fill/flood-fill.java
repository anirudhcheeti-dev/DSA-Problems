class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int main=image[sr][sc];
        if(main==color) return image;
        //to make sure the first elemtn we get itself isnt the colour;
        dfs(image,sr,sc,color,main);
        return image;
    }
    public void dfs(int[][] image, int row, int col, int color,int main){
        if(row<0||row>=image.length||col<0||col>=image[0].length){
            return;
        }
        if(image[row][col]!=main) return;
        image[row][col]=color;
        dfs(image,row-1,col,color,main);
        dfs(image,row+1,col,color,main);
        dfs(image,row,col-1,color,main);
        dfs(image,row,col+1,color,main);
    }
}