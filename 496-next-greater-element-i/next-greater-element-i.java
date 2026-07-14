class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> st=new ArrayDeque<>();
        int[] res=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }
        Arrays.fill(res,-1);
        for(int i=0;i<nums2.length;i++){
            int val=nums2[i];
            while(!st.isEmpty()&&val>st.peek()){
                int pop=st.pop();
                int ind=map.get(pop);
                res[ind]=val;
            }
            if(map.containsKey(val)){
                st.push(val);
            }else{
                continue;
            }
        }
        return res;
    }
}