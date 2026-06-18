class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int val=0;
        //int dif=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int dif=0;
                sum=nums[i]+nums[j]+nums[k];
                if(sum==target) return target;
                else if(sum<target){
                    dif=Math.abs(sum-target);
                    if(dif<min){
                        min=dif;
                     val=sum;
                    }
                    j++;
                }    
                else if(sum>target){
                    dif=Math.abs(sum-target);
                    if(dif<min){
                        min=dif;
                     val=sum;
                    }
                    k--;
                }    
                    //min=Math.min(min,dif);
                }
            }
            return val;
        }
    }