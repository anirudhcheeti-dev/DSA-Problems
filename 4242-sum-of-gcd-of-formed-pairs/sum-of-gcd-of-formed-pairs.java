class Solution {
    public long gcdSum(int[] nums) {
        int  max=0;
        int[] pre=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int f=findgcd(nums[i],max);
            pre[i]=f;
        }
        Arrays.sort(pre);
        int i=0;
        int j=pre.length-1;
        long sum=0;
        while(i<j){
            sum+=findgcd(pre[i],pre[j]);
            i++;
            j--;
        }
        return sum;

    }
    public int findgcd(int a,int b){
       if(b==0){
        return a;
       }
        return findgcd(b,a%b);
    }
}