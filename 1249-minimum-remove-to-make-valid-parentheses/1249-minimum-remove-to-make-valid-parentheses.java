class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb= new StringBuilder();
        Deque<Integer> characterStack = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        for(int i =0 ;i<s.length();i++){
            if(s.charAt(i) == '('){
                characterStack.push(i);
            }else if(s.charAt(i) == ')'){
                if(!characterStack.isEmpty()){
                    characterStack.pop();
                }else{
                    set.add(i);
                }
                
            }
        }
        while(!characterStack.isEmpty())set.add(characterStack.pop());
            
        
        StringBuffer str = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(!set.contains(i)){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
        
    }
}