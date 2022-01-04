class Solution {
    public String firstPalindrome(String[] words) {
        int length = words.length;
        for(String word : words){
            boolean isPalindrome = checkPalindrome(word);
            if(isPalindrome){
                return word;
            }
        }
        return "";    
    }
  
    public boolean checkPalindrome(String word){
        int start = 0, length = word.length(),end = length -1;
        while(start<=end){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}