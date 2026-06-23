class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        //int n=people.length;
        int b=0;

        while(i<=j){
            if((arr[i]+arr[j])>limit&& arr[j]<=limit){
                b++;
                j--;
            }
            else if((arr[i]+arr[j])<=limit){
                b++;
                i++;
                j--;
            }
    }
    return b;
    }
}