class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int x = 0;
       for(String operation: operations){
           if(operation.contains("+")){
               x++;
           }
           if(operation.contains("-")){
               x--;
           }
       }
        return x;
    }
}