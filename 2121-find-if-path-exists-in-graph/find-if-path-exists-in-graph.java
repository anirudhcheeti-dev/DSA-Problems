class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] i:edges){
            int u=i[0];
            int v=i[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visit=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        visit[source]=true;
        q.offer(source);

        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination) return true;
            for(int i:adj.get(curr)){
                if(!visit[i]){
                    visit[i]=true;
                    q.offer(i);
                }
            }
        }
        return false;
    }
}