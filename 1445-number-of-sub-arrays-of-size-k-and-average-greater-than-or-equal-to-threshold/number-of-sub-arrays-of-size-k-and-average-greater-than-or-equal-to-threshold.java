class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int count=0;
        int right=0;
        while(right<k){
            sum+=arr[right];
            right++;
        }
            if(sum/k>=threshold) count++;
            int left=0;
            while(right<arr.length){
                sum=sum-arr[left];
                left++;
                sum+=arr[right];
                right++;
                if(sum/k>=threshold) count++;
            }
        return count;
    }
}