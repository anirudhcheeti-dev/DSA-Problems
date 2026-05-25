class Solution {
    public void sortColors(int[] nums) {
        //int[] res=new int[nums.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=pq.poll();
        }
        
    }
}