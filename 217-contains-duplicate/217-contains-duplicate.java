class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashmap = new HashSet<Integer>();
        boolean flag = false;
        for(int i = 0; i < nums.length ; i++){
            if(!(hashmap.add(nums[i]))){
                return true;
            }
        }
        return false;
    }
}