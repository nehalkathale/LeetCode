class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1,  pivot;
        while(left <= right){
            pivot = left + (right - left) /2;
            if(nums[pivot]==target){
                return pivot;
            }else if(nums[pivot] > target){
                right = right - 1;
            }else{
                left = left +1;
            }
        }
        return left;
    }
}