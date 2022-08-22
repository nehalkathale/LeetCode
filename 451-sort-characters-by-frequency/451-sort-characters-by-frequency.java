class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> count = new HashMap<>();
        for(char c : s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        List<Character> characters = new ArrayList<>(count.keySet());
        Collections.sort(characters,(a,b)->count.get(b) - count.get(a));
        StringBuffer str = new StringBuffer();
        for(char c: characters){
            int frequency = count.get(c);
            for(int i=0;i<frequency;i++){
                str.append(c);
            }
        }
        return str.toString();
    }
}