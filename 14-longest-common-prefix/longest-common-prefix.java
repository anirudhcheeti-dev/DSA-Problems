class Solution {
    public String longestCommonPrefix(String[] strs) {
        int maxLen=strs[0].length();


        for(int i = 1; i < strs.length; i++){

            int j = 0;
            
            while(j < strs[i].length() && j<maxLen){
                if(strs[i].charAt(j) != strs[0].charAt(j)){
                    break;
                }
                j++;
            }
            maxLen = j;
        }


        return strs[0].substring( 0, maxLen);
    }
}