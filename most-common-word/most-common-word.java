class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        String[] words = normalizedStr.split("\\s+");
         Map<String, Integer> wordCount = new HashMap();
        Set<String> bannedWords = new HashSet();
        for (String word : banned)
            bannedWords.add(word);
        for (String word : words) {
            if (!bannedWords.contains(word))
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
                return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}