class Solution {
    public String simplifyPath(String path) {
        Stack<String> stringStack = new Stack<>();
        String[] array = path.split("/");
        for(String str : array){
            if(!stringStack.empty() && str.equals(".."))
                stringStack.pop();
            else if(!str.equals(".") && !str.equals("..") && !str.equals("")){
                stringStack.push(str);
            }
        }  
        List<String> list = new ArrayList(stringStack);
        return "/"+String.join("/", list);                            
    }
}