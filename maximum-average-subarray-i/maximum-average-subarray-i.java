class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, average = 0, maxSum = 0;
        for(int i = 0; i<k; i++){
            sum = sum + nums[i];
        }
        maxSum = sum;
        for(int i = 1; i<=nums.length - k ; i++){
            sum = sum + nums[k+i - 1] - nums[i-1];
            maxSum = Math.max(maxSum,sum);
        }
           return maxSum/k;
        
        
    }
   
}