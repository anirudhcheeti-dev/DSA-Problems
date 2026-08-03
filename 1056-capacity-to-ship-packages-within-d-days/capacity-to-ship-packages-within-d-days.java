class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int min=Integer.MIN_VALUE;
        for(int i:weights){
            sum+=i;
            min=Math.max(min,i);
        }
        int i=min;
        int j=sum;
        int res=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            boolean a=helper(weights,mid,days);
            if(a==true){
                res=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return res;
    }
    public boolean helper(int[] weights,int n,int days){
        int sum=0;
        int count=1;
        for(int i:weights){
            if(sum+i<=n){
                sum+=i;
            }else{
                count++;
                sum=i;
            }
        }
        return count<=days;
    }
}