class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int left = 0;
        int right = len - 1;
        String sc=s.toLowerCase();
        while (left < right) {
            if(!Character.isLetterOrDigit(sc.charAt(left))) {
                left++;
            }
            else if(!Character.isLetterOrDigit(sc.charAt(right))) {
                right--;
            }
            else if (sc.charAt(left) != sc.charAt(right)) {
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}