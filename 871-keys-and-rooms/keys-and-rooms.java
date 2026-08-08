class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visit = new boolean[n];
        Deque<Integer> q=new LinkedList<>();
        visit[0]=true;
        q.add(0);
        int count=1;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int i:rooms.get(curr)){
                if(!visit[i]){
                    visit[i]=true;
                    q.offer(i);
                    count++;
                }
            }
        }
        return count==n;
    }
}