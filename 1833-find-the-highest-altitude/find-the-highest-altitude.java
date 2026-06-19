class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int cm=0;
        for(int i:gain){
            cm+=i;
            max=Math.max(max,cm);
        }
        return max;
    }
}