class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)) return i;
            set.add(i);
        }
        return -1;
        
        
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int max=0;
        // int ans=0;
        // for(int i:map.keySet()){
        //     if(map.get(i)>max){
        //         max=map.get(i);
        //         ans=i;
        //     }
        // }
        // return ans;
    }
}