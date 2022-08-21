class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList();
        }
        Map<String,List> answer = new HashMap<String,List>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (!answer.containsKey(key)) answer.put(key, new ArrayList());
            answer.get(key).add(s);
        }
        return new ArrayList(answer.values());
    }
}