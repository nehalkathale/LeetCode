class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        String operations = "+-/*";
        for(String token : tokens){
            if(operations.contains(token)){
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                if(token.equals("+"))
                    stack.push(operand1 + operand2);
                else if(token.equals("-"))
                    stack.push(operand2 - operand1);
                else if(token.equals("*"))
                    stack.push(operand2 * operand1);
                else if(token.equals("/"))
                    stack.push(operand2 / operand1);
            }else{
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.peek();
    }
}