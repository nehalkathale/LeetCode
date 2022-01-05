class Solution {
    public String reverseWords(String s) {        
        char[] charArr = s.toCharArray();
        int start = 0, end = 0;
        for(; end < charArr.length; end++){
            if(charArr[end] == ' '){
                reverse(charArr, start, end-1);
                start = end+1;
            }
        }
        reverse(charArr, start, end-1);
        return new String(charArr);
    }
    
    private void reverse(char[] c, int start, int end){
        while(start < end){
            char tmp = c[end];
            c[end] = c[start];
            c[start] = tmp;
            start++;
            end--;
        }
    }
}