class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        pangram = {}
        for i in range(len(sentence)):
            if sentence[i] in pangram:
                pangram[sentence[i]] += 1
            else:
                pangram[sentence[i]] = 1
        if len(pangram) == 26:
            return True
        return False