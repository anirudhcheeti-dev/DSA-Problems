class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0;
        int left=0;
        int bottom=row-1;
        int right=col-1;
        ArrayList<Integer> list=new ArrayList<>();
        helper(top,bottom,left,right,list,matrix);
        return list;
    }
    public void helper(int top,int bottom,int left,int right,ArrayList<Integer> list,int[][] matrix){
        if(top>bottom||left>right){
            return;
        }
        //left to right

        for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
        }
        top++;
        //top to bottom
        for(int i=top;i<=bottom;i++){
            list.add(matrix[i][right]);
        }
        right--;
        //right to left
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            list.add(matrix[bottom][i]);
        }
        bottom--;
        }
        //bottom to up
        if(left<=right){
         for(int i=bottom;i>=top;i--){
            list.add(matrix[i][left]);
        }
       left++;
        }
        helper(top,bottom,left,right,list,matrix);
        //PARTIAL RECURSION
    }
}