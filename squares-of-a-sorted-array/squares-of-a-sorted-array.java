class Solution {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int length = nums.length;
        int high = length - 1;
        int arrayToReturn[] = new int[length];
        int index = length - 1;
        while(high >= low){
            if((Math.abs(nums[low])) <= (Math.abs(nums[high]))){
                arrayToReturn[index] = Math.abs(nums[high]) * Math.abs(nums[high]);
                high--;                                        
            }else if((Math.abs(nums[low])) > (Math.abs(nums[high]))){
                arrayToReturn[index] = Math.abs(nums[low]) * Math.abs(nums[low]);
                low++;
            } 
            index --;
        }
        return arrayToReturn;
    }
}