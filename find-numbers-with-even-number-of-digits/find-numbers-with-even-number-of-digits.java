class Solution {
    public int findNumbers(int[] nums) {
        int totalEvenDigitNumbers = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int reminder = Integer.MAX_VALUE;
            int digit = 1;
            while((nums[i] /=10) != 0){
                digit ++;
            }
            if(digit %2 == 0){
                totalEvenDigitNumbers++;
            }
        }
        return totalEvenDigitNumbers;
    }
}