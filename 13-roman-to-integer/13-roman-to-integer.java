import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

class Solution {
    public int romanToInt(String s) {
        Map<String , Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);

        CharacterIterator charItr = new StringCharacterIterator(s);
        int result = 0;

        while (charItr.current() != CharacterIterator.DONE) {
            String currentChar = String.valueOf(charItr.current());
            String nextChar = String.valueOf(charItr.next());
            String combinedChar = new                         
                StringBuilder(result).append(currentChar).append(nextChar).toString();
            if (map.containsKey(combinedChar)) {
                result += map.get(combinedChar);
                charItr.next();
            }
            else
                result += map.get(currentChar);

        }
        return result;
    }
}