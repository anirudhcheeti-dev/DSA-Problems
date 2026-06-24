class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (i = 0; i < n - 3; i++) {
            
            for (int j = i + 1; j < n - 2; j++) {
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        if (!ans.contains(list)) {
                            res.add(list);
                            ans.add(list);
                            k++;
                            l--;
                        }
                        else{
                            k++;
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return res;
    }
}