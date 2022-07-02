class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        length = len(prices)
        for i in range (length -1):
            for j in range(i+1, length):
                if prices[i] >= prices[j]:
                    prices[i] = prices[i] - prices[j]
                    break
                else:
                    continue
        return prices
