class Solution {
    public String removeDuplicates(String s) {
     Stack<Character> stackChar =  new Stack<>();
     for(Character charc : s.toCharArray()){
         if(!stackChar.isEmpty() && stackChar.peek() == charc){
            stackChar.pop();
         }else{
             stackChar.push(charc);
         }
     }  
        StringBuilder sb= new StringBuilder();
        while(!stackChar.isEmpty()){
            sb.append(stackChar.pop());
        }
        return String.valueOf(sb.reverse());
    }
}