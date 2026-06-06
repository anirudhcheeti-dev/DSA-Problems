class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    check(matrix, i, j);
                    
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-999) matrix[i][j]=0;
            }
        }
    }
    private void check(int[][] matri, int row, int col) {
        for (int i = 0; i < matri.length; i++) {
                if(matri[i][col]!=0) matri[i][col]=-999;
        }
            for (int j = 0; j < matri[0].length; j++) {
                if(matri[row][j]!=0) matri[row][j]=-999;
            }
        
    }


}