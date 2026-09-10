class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q=new LinkedList<>();
        int row=maze.length;
        int col=maze[0].length;
        q.add(entrance);
        maze[entrance[0]][entrance[1]]='+';
        int distance=0;
        int[][] directions = {{1, 0},{-1, 0},{0, 1},{0, -1}};
        while(!q.isEmpty()){
            distance++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int[] dir:directions){
                    int nr=r+dir[0];
                    int nc=c+dir[1];
                    if(nr>=0 && nr<row && nc>=0 && nc<col && maze[nr][nc]=='.'){
                        if(nr==0||nr==row-1||nc==0||nc==col-1) return distance;
                        maze[nr][nc]='+';
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return -1;
    }
}