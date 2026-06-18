class Solution {
    public int mySqrt(int x) {
        int i=1;
        int j=x;
        int mid=0;
        int ans=0;
        if(x==0||x==1){
            return x;
        }
        while (i<=j){
             mid=i+(j-i)/2;
            if((long)mid*mid<=(long)x) {
                ans=mid;
                i=mid+1;
                
            }
            else { j=mid-1;
        }
        }
        return ans;
    
}
}