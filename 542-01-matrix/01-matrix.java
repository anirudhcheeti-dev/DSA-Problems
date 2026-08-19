class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
            //THIS IS MULTI BFS 
            //WE ADD ELEMENTS OF 0 TO QUEUE 
                    q.add(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        int[][] ans = new int[mat.length][mat[0].length];
        //INITIALIZE EMPTY ARRAY AND CHECK ALL 4 SIDES USING THE DIR
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int[] dir : dirs){
                    int nr=r+dir[0];
                    int nc=c+dir[1];

                    if(nr>= 0 && nc>=0 && nr<mat.length && nc<mat[0].length && !visited[nr][nc]){
                        //MARK VISITED TRUE

                        visited[nr][nc]=true;
                        ans[nr][nc]=ans[r][c]+1;
                        //WHEN WE FIND A 1 WE PLUS 1 TO IT AND ADD IT TO QUEUE.
                        // WE CHECK THIS NEW 1 NEIGBOURS AND ADD PLUS 1 TO IT TO INCREASE THE DISTANCE FROM 0S
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return ans;
    }
}