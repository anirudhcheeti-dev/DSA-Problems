class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int i=1;
        while(i<nums.length){
            while(nums[i-1]+1!=nums[i]&&i<nums.length){
                list.add(nums[i-1]+1);
                nums[i-1]=nums[i-1]+1;
            }
            i++;
        }
        return list;
        
        
        
        
        // HashSet<Integer> set=new HashSet<>();
        // int max=0;
        // int min=Integer.MAX_VALUE;
        // for(int i:nums){
        //     min=Math.min(min,i);
        //     max=Math.max(max,i);
        //     set.add(i);
        // }
        // List<Integer> list=new ArrayList<>();
        // for(int i=min;i<max;i++){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }
        // return list;
    }
}