class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        int v=0;
        while(k!=0){
            v=q.poll();
            k--;
        }
        return v;
    }
}