class Solution:
    def isPalindrome(self, x: int) -> bool:
        strx = str(x)
        revstr = strx[::-1]
        if revstr == strx:
            return True
        else: 
            return False