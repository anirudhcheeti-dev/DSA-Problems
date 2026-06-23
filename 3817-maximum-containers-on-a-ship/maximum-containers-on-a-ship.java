class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min((w*(n*n))/w,(maxWeight/w));
    }
}