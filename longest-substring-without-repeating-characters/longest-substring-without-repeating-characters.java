class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        
        int maxLength = 0;
        int[] seen = new int[128];
        
        int i = 0;
        int j = 0; 
        
        while (i < s.length()) {
            
            if ((s.length() - (i + 1)) < maxLength) {
                break;
            }
            
            while (j < s.length() && seen[s.charAt(j)] == 0) {
                seen[s.charAt(j)]++;
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            }
            
            seen[s.charAt(i)]--;
            i++;
        }
        
        return maxLength;
    }
}