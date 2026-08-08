class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colour = new int[n];
        for(int i=0;i<n;i++){
            if(colour[i]!=0) continue;
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            colour[i]=1;
            while(!q.isEmpty()){
                int curr=q.poll();
                for(int j:graph[curr]){
                    if(colour[j]==0){
                        colour[j]=-colour[curr];
                        q.add(j);
                    }else if(colour[j]==colour[curr]) return false;
                }
            }
        }
        return true;
    }
}