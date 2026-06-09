class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        int max;
        int min=Integer.MAX_VALUE;
        if(nums.length==0) return 0;
        for (int num : nums) {
            set.add(num);
            //min = Math.min(min, num);
        }       
        int maxlen=0;
            for(int num:set){
            if(!set.contains(num-1)){
                max=1;
            while(set.contains(num+max)){
                max++;
                
            }
                maxlen=Math.max(maxlen,max);
            }
            //min
            
            }
            //if (set.contains(min + 1)) {
                //max++;
                //set.remove(num);

            return maxlen;
        }
        //return max;
    }
