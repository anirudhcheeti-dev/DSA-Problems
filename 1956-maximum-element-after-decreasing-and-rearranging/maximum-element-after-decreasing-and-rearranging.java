class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int i=1;
        Arrays.sort(arr);
        arr[0]=1;
        int max=arr[0];
        while(i<=arr.length-1){
            if(Math.abs(arr[i]-arr[i-1])<=1){
                i++;
            }
            else{
                arr[i]=arr[i-1]+1;
            }
        }
        return arr[i-1];
    }
}