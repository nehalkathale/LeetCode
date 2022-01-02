class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length, first = 0, last = length - 1 , answer =-1;
        while(first <= last){
            int mid = first + (last - first)/2;
            if(nums[mid] == target){
                answer =  mid;
                break;
            }
            else if(nums[mid]>target)
                last = mid - 1;
            else{
                first = mid + 1;
            }
        }
        return answer;
    }
     
}