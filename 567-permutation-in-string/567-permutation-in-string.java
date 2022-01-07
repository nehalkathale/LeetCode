class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) 
            return false;
        int[] alphabets = new int[26];
        int length = s1.length();
        int count = length;
        char[] sArr = s2.toCharArray();
        for(char character : s1.toCharArray()){
            alphabets[character-'a']++;
        }
        int start = 0;
        int end = 0;
        while(end<sArr.length){
            if(alphabets[sArr[end++]-'a']-->0) count--;
            while(count==0){
                if(end-start == length) return true;
                if(alphabets[sArr[start++]-'a']++==0) count++;
            } 
        }
        return false;
    }
}