class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean[] visit=new boolean[isConnected.length];
        for(int i=0;i<n;i++){
            if(!visit[i]){
            dfs(i,isConnected,n,visit);
            count++;
            }
            
        }
        return count;
    }
        public void dfs(int row,int[][] isConnected,int n,boolean[] visit){
            visit[row]=true;
            for(int j=0;j<n;j++){
                if(isConnected[row][j]==1&&!visit[j]){
                    dfs(j,isConnected,n,visit);
                }
            }
        }
}