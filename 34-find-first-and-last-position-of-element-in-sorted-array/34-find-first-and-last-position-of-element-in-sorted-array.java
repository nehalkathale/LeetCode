class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurance = binarySearch(nums,target,true);
        if(firstOccurance == -1){
            return new int[]{-1,-1};
        }
        int lastOccurance = binarySearch(nums,target,false);
        return new int[]{firstOccurance,lastOccurance};
        
    }
    public int binarySearch(int[] nums,int target, boolean isFirst){
        int left = 0, right = nums.length - 1;
        while( left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                if(isFirst){
                     if (mid == left || nums[mid - 1] != target) {
                        return mid;
                    }
                    right = mid - 1;
                }else{
                    if(mid == right || nums[mid+1] != target){
                        return mid;
                    }
                    left = mid + 1;
                }
                
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        } 
         return -1;
    }
   
}