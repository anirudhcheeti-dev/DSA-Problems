class Solution {
    public int digitFrequencyScore(int n) {
        int ans=0;
        int i=0;
        while(i<n){
            ans+=n%10;
            n=n/10;
        }
        return ans;
    }
}