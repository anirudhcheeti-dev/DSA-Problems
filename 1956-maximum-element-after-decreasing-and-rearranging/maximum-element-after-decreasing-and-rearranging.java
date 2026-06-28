class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int i=1;
        int j=arr.length-1;
        Arrays.sort(arr);
        arr[0]=1;
        int max=arr[0];
        //Arrays.sort(arr);
        while(i<=j){
            //int sum=Math.abs(arr[i]-arr[i-1]);
            if(Math.abs(arr[i]-arr[i-1])<=1){
                max=Math.max(max,arr[i]);
                i++;
            }/*else if(Math.abs(arr[i]-arr[i-1])>1&&Math.abs(arr[i]-arr[i-1])<=10){
                arr[i]=arr[i]-1;
            }*/
            else{
                arr[i]=arr[i-1]+1;
            }
        }
        return max;
    }
}