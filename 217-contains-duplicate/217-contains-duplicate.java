class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<Integer>();
        for(int i :nums){
            if(sets.contains(i)){
                return true;
            }else{
                sets.add(i);
            }
        }
        return false;
    }
}