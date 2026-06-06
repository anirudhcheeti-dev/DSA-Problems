class Solution {
    public int maxProfit(int[] p) {
        
        int max=0;
        int cheap=0;
        int cm=0;
        for(int i=0;i<p.length;i++){
            if(p[i]<=p[cheap]){
                p[cheap]=p[i];
                
            }
            else{
                cm=Math.max(cm,Math.abs(p[cheap]-p[i]));
                max=Math.max(cm,max);
            } 
        }
        return max;
    }

}