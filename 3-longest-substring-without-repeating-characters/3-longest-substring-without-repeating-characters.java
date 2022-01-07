class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }    
        int start = 0, end = 0, max =0;
        HashSet<Character> set = new HashSet<Character>();
        while( end < s.length()){
            if(!(set.contains(s.charAt(end)))){
                set.add(s.charAt(end));
                end++;
                max = Math.max(set.size(),max);
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}