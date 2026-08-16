class Solution {
    public int minPenalty(int period, int[] lights, int[] a) {
        int n=lights.length;
        int m=a.length;
        int wait=0;
        Arrays.sort(lights);
        for(int i=0;i<m;i++){
            int r=a[i]%period;
            if(r>=lights[n-1]){
                wait=Math.max(wait,period-r);
            }
            else wait+=0;
        }
        return wait;
    }
}