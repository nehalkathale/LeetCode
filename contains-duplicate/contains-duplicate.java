class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        boolean flag = false;
        for(int i = 0; i < nums.length ; i++){
            if(hashmap.containsKey(nums[i])){
                flag = true;
                break;
            }else{
                hashmap.put(nums[i],nums[i]);
                flag =  false;
            }
        }
        return flag;
    }
}