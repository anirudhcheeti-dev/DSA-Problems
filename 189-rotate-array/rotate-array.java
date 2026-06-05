class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] arr = new int[n];
        if (k == 0) {
            return;
        }
        for(int i=0;i<k;i++){
            arr[i]=nums[n-k+i];
        }
        for(int i=0;i<(n-k);i++){
            arr[i+k]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}
       /*
        k = k % nums.length;
        int n = nums.length-1;
        int[]  temp = new int[n];
        int i=0;
        //int l=n-k-1;
        for(int j=nums.length-1;j>=k;j--) {
            int l=j-k-1;
            if(l>0){
            temp[l]=nums[j];
            }
        }
        for(int j=0;j<(n-k);j++) {
            temp[j + k] = nums[j];
        }
         for(int j=0;j<temp.length;j++) {
            nums[j]=temp[j];
        }
*/