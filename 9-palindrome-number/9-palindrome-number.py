class Solution:
    def isPalindrome(self, x: int) -> bool:
        intStr = str(x)
        reverseString = intStr[::-1]
        if reverseString == intStr:
            return True
        else: 
            return False