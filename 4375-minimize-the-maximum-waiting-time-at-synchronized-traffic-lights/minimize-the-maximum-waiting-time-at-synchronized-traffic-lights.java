class Solution {
    public int minPenalty(int period, int[] lights, int[] a) {
        int n=lights.length;
        int m=a.length;
        int wait=0;
        // Arrays.sort(lights); - The person who seeing this (using this give 10ms so dont);
        int maxLight=0;
        for(int i:lights){
            if(i>maxLight){
                maxLight=i;
            }
        }
        for(int i=0;i<m;i++){
            int r=a[i]%period;
            if(r>=maxLight){
                wait=Math.max(wait,period-r);
            }
        }
        return wait;
    }
}