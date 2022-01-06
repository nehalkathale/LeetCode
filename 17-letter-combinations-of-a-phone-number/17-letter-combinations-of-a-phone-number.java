class Solution {
    public List<String> letterCombinations(String digits) {
         if(digits.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> listToReturn = new ArrayList<>();
        HashMap<String,List<String>> letters = new HashMap<String,List<String>>();
        letters.put("2",Arrays.asList("a","b","c"));
        letters.put("3",Arrays.asList("d","e","f"));
        letters.put("4",Arrays.asList("g","h","i"));
        letters.put("5",Arrays.asList("j","k","l"));
        letters.put("6",Arrays.asList("m","n","o"));
        letters.put("7",Arrays.asList("p","q","r","s"));
        letters.put("8",Arrays.asList("t","u","v"));
        letters.put("9",Arrays.asList("w","x","y","z"));
        if(digits.length() == 1){
             return letters.get(digits);
        }
        int i=1;
        int n=digits.length();
        while(i<n) {
            letters.put(digits.substring(0,i+1), getCombination(letters.get(digits.substring(0,i)), letters.get(digits.substring(i,i+1))));
                i++;
        }
        return letters.get(digits);

    }
    private static List<String> getCombination(List<String> list1, List<String> list2) {

        List<String> res= new ArrayList<>();

        for(String str1: list1) {

            for(String str2: list2) {

                res.add(str1+str2);
            }
        }

        return res;
    }
}