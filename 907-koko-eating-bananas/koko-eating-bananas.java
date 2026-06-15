class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int start=1;
       int max=0;
       for(int i : piles){
        max=Math.max(max,i);
       } 
       int res=max;

       while(start<=max){
        int mid=start+(max-start)/2;

        if(canfinish(piles ,  mid , h)){
            res=mid;
            max=mid-1;
        }
        else{
        start=mid+1;
        }
        //long totalhrs=0;
       }
       return res;
    }
    //long totalhrs=0;
    private boolean canfinish(int[] piles , int quick, int hours){
        long totalhrs=0;
        for(int i : piles){
        totalhrs+=(i+quick-1)/quick;
        }
        return totalhrs<=hours;
    }
}