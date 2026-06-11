class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max=0;
        int maxlen=0;
        for(int i:set){
            if(!set.contains(i-1)){
                max=1;
                while(set.contains(i+max)){
                    max++;
                }
                    maxlen=Math.max(max,maxlen);
            }
        }
        return maxlen;
    }
}