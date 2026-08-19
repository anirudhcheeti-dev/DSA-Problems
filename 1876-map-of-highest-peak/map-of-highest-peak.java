class Solution {
    public int[][] highestPeak(int[][] mat) {
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    q.add(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        int[][] ans = new int[mat.length][mat[0].length];
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
                        visited[nr][nc]=true;
                        ans[nr][nc]=ans[r][c]+1;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return ans;
    }
}