class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mapInt = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length;i++){
            int requiredNum = target - nums[i];
            if(mapInt.containsKey(requiredNum)){
                int toReturn[] = {mapInt.get(requiredNum), i};
                return toReturn;
            }
                        mapInt.put(nums[i],i);

        }
        return null;
    }
}

