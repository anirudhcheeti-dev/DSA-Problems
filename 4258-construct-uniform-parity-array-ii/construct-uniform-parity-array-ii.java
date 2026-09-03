class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] num2=new int[nums1.length];
        int small=Integer.MAX_VALUE;
        for(int j=0;j<nums1.length;j++){
            small=Math.min(small,nums1[j]);
        }

        for(int i=0;i<nums1.length;i++){
            if(small%2!=0 && nums1[i]%2==0){
                num2[i]=nums1[i]-small;
            }
            else{
                num2[i]=nums1[i];
            }
        }
        int odd=0;
        int even=0;
        for(int i=0;i<num2.length;i++){
            if(num2[i]%2==0) even++;
            else odd++;
        }
        if(num2.length==odd || num2.length==even) return true;
        return false;
    }
}