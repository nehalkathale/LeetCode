class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        maxWealth = 0
        for account in accounts:
            wealth = sum(account)
            maxWealth = max(maxWealth,wealth)
        return maxWealth