class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        count = {}
        for i in range(len(nums)):
            if nums[i] in count:
                return True
            else:
                count[nums[i]] = 1
        print(count)
        return False
