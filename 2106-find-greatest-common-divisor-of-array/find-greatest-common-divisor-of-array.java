class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       int gcd=1;
       return findgcd(nums[0],nums[nums.length-1]);

    }
    public int findgcd(int a,int b){
        if(b==0){
            return a;
        }
         return findgcd(b,a%b);
    }
}