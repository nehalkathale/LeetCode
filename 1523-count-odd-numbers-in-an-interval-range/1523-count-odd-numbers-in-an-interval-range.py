class Solution:
    def countOdds(self, low: int, high: int) -> int:
        mid = (high-low)//2
        if low%2 == 0 and high%2== 0: 
            return mid
        else:
            return mid + 1