class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet set = new HashSet<>();
        for(Character jewel : jewels.toCharArray()){
            set.add(jewel);
        }
        for(Character stone : stones.toCharArray()){
            if(set.contains(stone))
                count++;
        }
        return count;
    }
}