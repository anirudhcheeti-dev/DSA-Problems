class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        helper(1,n,k,list,new ArrayList<>());
        return list;
    }
        public void helper(int visit,int n,int k,List<List<Integer>> res,List<Integer> curr){
            if(curr.size()==k){
                res.add(new ArrayList<>(curr));
                return;
            }
            for(int i=visit;i<=n;i++){
                curr.add(i);
                helper(i+1,n,k,res,curr);
                curr.remove(curr.size()-1);
            }
        }
}