class Solution {
    public int candy(int[] r) {
        int n=r.length;
        int[] pre=new int[n];
        Arrays.fill(pre,1);
        int count=0;
        for(int i=1;i<n;i++)
            if(r[i]>r[i-1]){
                pre[i]=pre[i-1]+1;
            }
        for(int i=n-1;i>0;i--){
            if(r[i-1]>r[i]){
                pre[i-1]=Math.max(pre[i]+1,pre[i-1]);
                }
        }
        for(int i:pre){
            count+=i;
        }
        return count;
    }
}