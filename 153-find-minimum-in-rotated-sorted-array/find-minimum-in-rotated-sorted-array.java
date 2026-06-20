class Solution {
    public int findMin(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int min=Integer.MAX_VALUE;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]>arr[j]){
                //min=Math.min(arr[j],min);
                i=mid+1;
            }
            else {
                //min=Math.min(arr[i],min);
                j=mid;
            }
            
        }
        return arr[i];
    }
}