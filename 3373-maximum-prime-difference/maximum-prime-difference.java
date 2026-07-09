class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
               min=Math.min(min,i); 
               max=Math.max(max,Math.abs(min-i));
            }
        }
        return max;
    }
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}