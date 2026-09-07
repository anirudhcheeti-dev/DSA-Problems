class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        boolean[] visited=new boolean[candidates.length];
        Arrays.sort(candidates);

        helper(0,visited,candidates,target,list,curr);
        return list;

    }
    public void helper(int st,boolean[] visit,int[]nums,int k,List<List<Integer>> res,List<Integer> curr){
        if(k==0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(k<0) return;

        for(int i=st;i<nums.length;i++){
            if(visit[i])continue;
            if(i>0&&nums[i]==nums[i-1]&&!visit[i-1]) continue;

            curr.add(nums[i]);
            visit[i]=true;
            helper(i+1,visit,nums,k-nums[i],res,curr);
            visit[i]=false;
            curr.remove(curr.size()-1);
        }
        //here i used a different approach instead of adding a running sum i subtracted the value from target.
    }
}