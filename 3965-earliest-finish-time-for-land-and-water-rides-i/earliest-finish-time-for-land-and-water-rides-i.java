class Solution {
    public int earliestFinishTime(int[] lan, int[] lad, int[] wat, int[] wad) {
        
        int n=lan.length;
        int m=wat.length;
        int minL=Integer.MAX_VALUE;
        int minW=minL;
        int res=minW;

        for(int i=0;i<n;i++){
            minL=Math.min(minL,lan[i]+lad[i]);
        }
        for(int i=0;i<m;i++){
            minW=Math.min(minW,wat[i]+wad[i]);
            res=Math.min(res,Math.max(minL,wat[i])+wad[i]);
        }
        for(int i=0;i<n;i++){
            res=Math.min(res,Math.max(minW,lan[i])+lad[i]);
        }
        return res;
    }
}