class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currentArray = maxArray = nums[0]
        for num in nums[1:]:
            currentArray = max(num,currentArray+num)
            maxArray = max(maxArray,currentArray)
        return maxArray