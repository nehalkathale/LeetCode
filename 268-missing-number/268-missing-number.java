class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length+1;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i =0;i<length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}