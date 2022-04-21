class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int totalCandies = candyType.length;
        for(Integer i : candyType){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int uniqueCandies = map.size();
        return(Math.min(uniqueCandies,totalCandies/2));
        
    }
}