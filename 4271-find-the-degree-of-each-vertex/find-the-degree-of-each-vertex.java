class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int res=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1) res++;
            }
            ans[i]=res;
        }
        return ans;
    }
}