class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int[] res=new int[n];
        Arrays.fill(res,-1);
        int big[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            big[i]=nums[i];
            big[i+n]=nums[i];
        }
        //using this beacuse i dont know how to do a circular array
        for(int i=0;i<n*2;i++){
            while(!st.isEmpty()&&big[st.peek()]<big[i]){
                int currind=st.pop();
                if(currind<n){
                    res[currind]=big[i];
                }
            }
            st.push(i);
        }
        return res;
    }
}