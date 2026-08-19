class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){ 
                    q.add(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        int dist=-1;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        //up down left right
        while(!q.isEmpty()){
            int size=q.size();
            dist++;
            // every time q runs we got a new neigbour hence we add
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int[] dir:dirs){
                    int nr=r+dir[0];
                    int nc=c+dir[1];
                    
                    if(nr>= 0 && nc>=0 && nr<grid.length && nc<grid[0].length && !visited[nr][nc]){
                        // this adds new neigbours to the queue
                        visited[nr][nc]=true;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return dist==0?-1:dist;
        // checks if there where any islands or not and give the result 
    }
}
// this is called shorted path algorithm using BFS or explanding frontier.