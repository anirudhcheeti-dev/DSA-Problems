class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0;
        int left=0;
        helper(top,n-1,left,n-1,matrix);
        return matrix;
    }
    int j=1;
    public void helper(int top,int bottom,int left,int right,int[][] matrix){
        if(top>bottom||left>right){
            return;
        }
        //left to right
        
        for(int i=left;i<=right;i++){
            matrix[top][i]=j;
            j++;
        }
        top++;
        //top to bottom
        for(int i=top;i<=bottom;i++){
            matrix[i][right]=j;
            j++;
        }
        right--;
        //right to left

        for(int i=right;i>=left;i--){
            matrix[bottom][i]=j;
            j++;
        }
        bottom--;
        
        //bottom to up
    
         for(int i=bottom;i>=top;i--){
            matrix[i][left]=j;
            j++;
        }
       left++;
        
        helper(top,bottom,left,right,matrix);
        //PARTIAL RECURSION
    }
}