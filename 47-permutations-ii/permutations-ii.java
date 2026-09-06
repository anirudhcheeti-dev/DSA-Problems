class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        helper(visited,nums,list,new ArrayList<>());
        return list;
    }
    public void helper(boolean[] visit,int[] nums, List<List<Integer>> res,List<Integer> curr){

        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visit[i]==true) continue;
            if(i>0&&nums[i]==nums[i-1]&&!visit[i-1]) continue;
            // a small change we check if duplicste and also if visit[i-1] is false because if we dont then it will again generate the same values.

            visit[i]=true;
            curr.add(nums[i]);
            helper(visit,nums,res,curr);
            visit[i]=false;
            curr.remove(curr.size()-1);
        }
    }
}