class Solution {
    public int maxArea(int[] ht) {
        int lt=0;
        int rt=ht.length-1;
        
        int res=1;
        
        int max=0;
        while(lt<=rt){
            //int min=Integer.MAX_VALUE;
            
            if(ht[lt]<=ht[rt]){
                res=ht[lt]*(rt-lt);
                max=Math.max(max,res);
                lt++;
            }
            else{
    
                res=ht[rt]*(rt-lt);
                max=Math.max(max,res);
                rt--;
            }
        }
        return max;
    }
}