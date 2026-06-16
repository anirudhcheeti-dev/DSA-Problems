class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2 ; i++){
            int j=i+1;
            int k=nums.length-1;
        while(j<k){
        
            
            if((nums[i] + nums[j] + nums[k]) == 0){
               List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k]);
                if(!set.contains(list)){
                res.add(list);
                set.add(list);
                }else{
                
                j++;
                k--;
                }
                
            }
            else if((nums[i]+nums[j]+nums[k])>0){
                k--;
            }
            else{
                //i++;
                j++;
            }
        }
        }
    return res;
    }
}