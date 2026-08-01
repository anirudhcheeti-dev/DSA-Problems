class Solution {
    public int findKthLargest(int[] nums, int k) {
        
            Arrays.sort(nums);
            return nums[nums.length-k];
        
        
        
        //  PriorityQueue<Integer> q=new PriorityQueue<>();
        // for(int i=0;i<nums.length;i++){
        //     q.add(nums[i]);
        //     if(q.size()>k) q.poll();
        // }
        // return q.peek();
        
        
        
        
        
        // PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        // for(int i=0;i<nums.length;i++){
        //     q.add(nums[i]);
        // }
        // int v=0;
        // while(k!=0){
        //    v= q.poll();
        //     k--;
        // }
        // return v;
    }
}