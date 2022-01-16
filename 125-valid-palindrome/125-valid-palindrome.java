class Solution {
    public boolean isPalindrome(String s) {
        s =  s.replaceAll("[^a-zA-Z0-9]", "");
        char array[] = s.toCharArray();
        int start = 0, end = array.length -1 ;
        while(start < end){
            while(!(Character.isLetterOrDigit(s.charAt(start)))){
                start++;
            }
            while(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }    
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))             {
                return false;
            }      
            start++;
                  end--;
            
        }
        return true;
    }
}