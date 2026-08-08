class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;// star problems rquire us to +1 so that we consider the centeral node.(just like tree root);
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
            // this is to ensure that the list is empty and has place to store values
        }

        //because an undirected graph 
        for(int[] i:edges){
            int u=i[0];
            int v=i[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i=1;i<=n;i++){
            if(adj.get(i).size()==n-1) return i;
        }
        return -1;
    }
}