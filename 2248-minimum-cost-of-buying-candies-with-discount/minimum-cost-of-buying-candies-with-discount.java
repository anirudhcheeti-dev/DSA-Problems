class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int k = 1;
        int sum = 0;
        for(int i = cost.length-1; i >=0 ; i--){
            if(k%3==0) {
                k=1;
            }
            else {
                k++;
                sum += cost[i];
            }
        }
        return sum;
    }
}