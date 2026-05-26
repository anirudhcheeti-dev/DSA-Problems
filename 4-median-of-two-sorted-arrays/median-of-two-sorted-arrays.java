class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int[] arr=new int[nums1.length+nums2.length];
      for(int i=0;i<nums1.length;i++) {
          arr[i] = nums1[i];
      }
      for(int i=0;i<nums2.length;i++) {
          arr[nums1.length+i] = nums2[i];
      }
      Arrays.sort(arr);
     int low=0;
      int high=arr.length-1;
      double res=0;
      while(low<=high) {
          if(arr[low]==arr[high]) {
              res=arr[low];
          }else{
          res= (double) (arr[low] + arr[high]) /2;
          }

          low++;
          high--;
      }
            return res;
    }
}