class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int len=n*(n+1)/2;
        int[] res=new int[len+1];
        int count=0;
        for(int i=0;i<nums.length;i++){
            int j=i;
            int sum=0;
            while(j<nums.length){
                sum+=nums[j];
                res[count]=sum;
                j++;
                count++;
            }
        }
        Arrays.sort(res);
        long result=0;
        int mod=1_000_000_007;
        for(int i=left;i<=right;i++){
            result=(result + res[i]) % mod;
            //left++;
        }
        return (int)result;
    }
}