class Solution {
    public List<Integer> sequentialDigits(int low, int high){
        List<Integer> ans = new ArrayList<>();
        String s = "123456789";
        for (int i = 0; i<=s.length(); i++) {
            for (int j = i+1;j<=s.length(); j++) {
                String sub=s.substring(i,j);
                int a = Integer.parseInt(sub);
                if (a>=low && a<=high) {
                    ans.add(a);
                }
            }
        }
        Collections.sort(ans);
        return ans;
        }
    }