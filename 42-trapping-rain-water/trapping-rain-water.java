class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int i=0;
        int j=n-1;
        int maxi=0;
        int maxj=0;
        int total=0;
        while(i<=j){
                if(h[i]<=h[j]) {
                    if (h[i] < maxi) {
                        total += maxi - h[i];
                    }else maxi = h[i];
                    i++;
                }
                else {
                    if (h[j] < maxj) {
                        total += maxj - h[j];
                    } else maxj = h[j];
                    j--;
                }
        }
        return total;
    }
}