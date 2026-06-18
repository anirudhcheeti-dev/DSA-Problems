class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int current=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            current+=nums[i];
            int l=current-k;
            if(map.containsKey(l)){
                count+=map.get(l);
                //map.put(current,1);
            }
            
             map.put(current,map.getOrDefault(current,0)+1);
        }
        return count;
    }
}