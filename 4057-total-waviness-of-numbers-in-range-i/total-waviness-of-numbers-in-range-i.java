class Solution {
    public int totalWaviness(int num1, int num2) {
        int result = 0;
        for (int i = num1; i <= num2; i++) {
            result += printWaviness(i);
        }
        return result;
    }

    private int printWaviness(int x) {
        String s = Integer.toString(x);
        if (x < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < s.length()-1; i++) {
            int prev=Character.getNumericValue(s.charAt(i-1));
            int next=Character.getNumericValue(s.charAt(i+1));
            int cur=Character.getNumericValue(s.charAt(i));
            if(cur>prev&&cur>next||cur<prev&&cur<next) {
                count++;
            }
        }
        return count;
    }
}